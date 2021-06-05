




import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;



class testPawn {
	private Board board;
	
	@Test
	void test1() {
		
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> pawnMethodSpaces;
		
		whatShouldBeThere.add(new Space(5,0));
		whatShouldBeThere.add(new Space(4,0));
	
		Space pawnSpace = TestingMethods.addPieceToBoard(new Pawn(true), board, 6, 0);
		pawnMethodSpaces = ((Pawn)pawnSpace.getPiece()).getMoveableSpaces(pawnSpace, board);
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere, pawnMethodSpaces));
	}
	
	void test2() {
		
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> pawnMethodSpaces;
		
		whatShouldBeThere.add(new Space(5,0));
		
		Pawn p = new Pawn(true);
		p.setFirstMove(false);
		Space pawnSpace = TestingMethods.addPieceToBoard(p, board, 6, 0);
		
		pawnMethodSpaces = ((Pawn)pawnSpace.getPiece()).getMoveableSpaces(pawnSpace, board);
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere, pawnMethodSpaces));
	}
	
	void test3() {
		
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> pawnMethodSpaces;
		
		whatShouldBeThere.add(new Space(4,0));
		whatShouldBeThere.add(new Space(3,0));
	
		Space pawnSpace = TestingMethods.addPieceToBoard(new Pawn(false), board, 2, 0);
		pawnMethodSpaces = ((Pawn)pawnSpace.getPiece()).getMoveableSpaces(pawnSpace, board);
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere, pawnMethodSpaces));
	}
	
	void test4() {
		
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> pawnMethodSpaces;
		
		whatShouldBeThere.add(new Space(3,0));
		
		Pawn p = new Pawn(false);
		p.setFirstMove(false);
		Space pawnSpace = TestingMethods.addPieceToBoard(p, board, 2, 0);
		
		pawnMethodSpaces = ((Pawn)pawnSpace.getPiece()).getMoveableSpaces(pawnSpace, board);
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere, pawnMethodSpaces));
	}
	
	@Test
	void test5() {
		
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> pawnMethodSpaces;
		
		whatShouldBeThere.add(new Space(5,0));
		whatShouldBeThere.add(new Space(4,1));
		whatShouldBeThere.add(new Space(5,1));
	
		Space pawnSpace = TestingMethods.addPieceToBoard(new Pawn(true), board, 6, 1);
		TestingMethods.addPieceToBoard(new Pawn(false), board, 5, 0);
		TestingMethods.addPieceToBoard(new Pawn(true), board, 5, 2);
		
		pawnMethodSpaces = ((Pawn)pawnSpace.getPiece()).getMoveableSpaces(pawnSpace, board);
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere, pawnMethodSpaces));
	}
	
	@Test
	void test6() {
		
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> pawnMethodSpaces;
		
		whatShouldBeThere.add(new Space(5,4));
		whatShouldBeThere.add(new Space(6,4));
		whatShouldBeThere.add(new Space(5,5));
	
		Space pawnSpace = TestingMethods.addPieceToBoard(new Pawn(false), board, 4, 4);
		TestingMethods.addPieceToBoard(new Pawn(true), board, 5, 5);
		TestingMethods.addPieceToBoard(new Pawn(false), board, 5, 6);
		
		pawnMethodSpaces = ((Pawn)pawnSpace.getPiece()).getMoveableSpaces(pawnSpace, board);
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere, pawnMethodSpaces));
	}
}


class testRook {
	private static Board board;

	@Test
	void test1() {
		board = new Board(true);
		
		Space rookSpace = TestingMethods.addPieceToBoard(new Rook(true),board,5,2);
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		//left
		whatShouldBeThere.add(new Space(5,1));
		whatShouldBeThere.add(new Space(5,0));
			

		//right
		whatShouldBeThere.add(new Space(5,3));
		whatShouldBeThere.add(new Space(5,4));
		whatShouldBeThere.add(new Space(5,5));
		whatShouldBeThere.add(new Space(5,6));
		whatShouldBeThere.add(new Space(5,7));
	
		//down
		whatShouldBeThere.add(new Space(6,2));
		whatShouldBeThere.add(new Space(7,2));	
	
		//up 
		whatShouldBeThere.add(new Space(4,2));
		whatShouldBeThere.add(new Space(3,2));
		whatShouldBeThere.add(new Space(2,2));
		whatShouldBeThere.add(new Space(1,2));
		whatShouldBeThere.add(new Space(0,2));
			
	ArrayList<Space> rookMethodSpaces = ((Rook)rookSpace.getPiece()).getMoveableSpaces(rookSpace,board);	
	assertTrue(TestingMethods.areEqual(whatShouldBeThere,rookMethodSpaces));
	}
	
	@Test
	void test2() {
	board = new Board(true);
		
	Space rookSpace = TestingMethods.addPieceToBoard(new Rook(true),board,5,2);
	TestingMethods.addPieceToBoard(new Pawn(true),board,5,5);
	ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
	//left
	whatShouldBeThere.add(new Space(5,1));
	whatShouldBeThere.add(new Space(5,0));
			

	//right
	whatShouldBeThere.add(new Space(5,3));
	whatShouldBeThere.add(new Space(5,4));

	//down
	whatShouldBeThere.add(new Space(6,2));
	whatShouldBeThere.add(new Space(7,2));	

	//up 
	whatShouldBeThere.add(new Space(4,2));
	whatShouldBeThere.add(new Space(3,2));
	whatShouldBeThere.add(new Space(2,2));
	whatShouldBeThere.add(new Space(1,2));
	whatShouldBeThere.add(new Space(0,2));
			
	ArrayList<Space> rookMethodSpaces = ((Rook)rookSpace.getPiece()).getMoveableSpaces(rookSpace,board);	

	assertTrue(TestingMethods.areEqual(whatShouldBeThere,rookMethodSpaces));
	}
	
	@Test
	void test3() {
	board = new Board(true);
		
	Space rookSpace = TestingMethods.addPieceToBoard(new Rook(true),board,5,2);
	TestingMethods.addPieceToBoard(new Pawn(false),board,5,5);
	ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
	//left
	whatShouldBeThere.add(new Space(5,1));
	whatShouldBeThere.add(new Space(5,0));
			

	//right
	whatShouldBeThere.add(new Space(5,3));
	whatShouldBeThere.add(new Space(5,4));
	whatShouldBeThere.add(new Space(5,5));

	//down
	whatShouldBeThere.add(new Space(6,2));
	whatShouldBeThere.add(new Space(7,2));	

	//up 
	whatShouldBeThere.add(new Space(4,2));
	whatShouldBeThere.add(new Space(3,2));
	whatShouldBeThere.add(new Space(2,2));
	whatShouldBeThere.add(new Space(1,2));
	whatShouldBeThere.add(new Space(0,2));
			
	ArrayList<Space> rookMethodSpaces = ((Rook)rookSpace.getPiece()).getMoveableSpaces(rookSpace,board);	

	assertTrue(TestingMethods.areEqual(whatShouldBeThere,rookMethodSpaces));
	}
}

class testBishop {
	private static Board board;
	
	
	@Test
	void test1() {
		board = new Board(true);
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> bishopMethodSpaces;
		
		// North west
		whatShouldBeThere.add(new Space(4,1));
		whatShouldBeThere.add(new Space(3,0));

		//South west
		whatShouldBeThere.add(new Space(6,1));
		whatShouldBeThere.add(new Space(7,0));

		//North east
		whatShouldBeThere.add(new Space(4,3));
		whatShouldBeThere.add(new Space(3,4));
		whatShouldBeThere.add(new Space(2,5));
		whatShouldBeThere.add(new Space(1,6));
		whatShouldBeThere.add(new Space(0,7));


		//South east
		whatShouldBeThere.add(new Space(6,3));
	whatShouldBeThere.add(new Space(7,4));

		
		Space bishopSpace = TestingMethods.addPieceToBoard(new Bishop(true),board,5,2);
		bishopMethodSpaces= ((Bishop)bishopSpace.getPiece()).getMoveableSpaces(bishopSpace,board);

		assertTrue(TestingMethods.areEqual(whatShouldBeThere,bishopMethodSpaces));
	}
	
	@Test
	void test2() {
		board = new Board(true);
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> bishopMethodSpaces;
		
		// North west
		whatShouldBeThere.add(new Space(4,1));
		whatShouldBeThere.add(new Space(3,0));

		//South west
		whatShouldBeThere.add(new Space(6,1));
		whatShouldBeThere.add(new Space(7,0));

		//North east
		whatShouldBeThere.add(new Space(4,3));
		whatShouldBeThere.add(new Space(3,4));


		//South east
		whatShouldBeThere.add(new Space(6,3));
		whatShouldBeThere.add(new Space(7,4));

		
		Space bishopSpace = TestingMethods.addPieceToBoard(new Bishop(true),board,5,2);
		TestingMethods.addPieceToBoard(new Bishop(true),board,5,2);
		TestingMethods.addPieceToBoard(new Pawn(true), board, 2, 5);
		bishopMethodSpaces= ((Bishop)bishopSpace.getPiece()).getMoveableSpaces(bishopSpace,board);

		assertTrue(TestingMethods.areEqual(whatShouldBeThere,bishopMethodSpaces));
	}
	
	@Test
	void test3() {
		board = new Board(true);
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> bishopMethodSpaces;
		
		// North west
		whatShouldBeThere.add(new Space(4,1));
		whatShouldBeThere.add(new Space(3,0));

		//South west
		whatShouldBeThere.add(new Space(6,1));
		whatShouldBeThere.add(new Space(7,0));

		//North east
		whatShouldBeThere.add(new Space(4,3));
		whatShouldBeThere.add(new Space(3,4));
		whatShouldBeThere.add(new Space(2,5));

		//South east
		whatShouldBeThere.add(new Space(6,3));
		whatShouldBeThere.add(new Space(7,4));

		
		Space bishopSpace = TestingMethods.addPieceToBoard(new Bishop(true),board,5,2);
		TestingMethods.addPieceToBoard(new Bishop(true),board,5,2);
		TestingMethods.addPieceToBoard(new Pawn(false),board,2,5);
		bishopMethodSpaces= ((Bishop)bishopSpace.getPiece()).getMoveableSpaces(bishopSpace,board);

		assertTrue(TestingMethods.areEqual(whatShouldBeThere,bishopMethodSpaces));
	}
}




class testMisc {
	private Game game;
	
	@Test
	void test1() {
		game = new Game();
		game.getBoard().initEmpty();
		TestingMethods.addPieceToBoard(new King(true), game.getBoard(), 4, 4);
		TestingMethods.addPieceToBoard(new Rook(true), game.getBoard(), 3,2);
		TestingMethods.addPieceToBoard(new Rook(false), game.getBoard(), 4, 2);
		TestingMethods.addPieceToBoard(new King(false), game.getBoard(), 1, 1);


		assertTrue(game.attemptMove(game.getBoard().getSpace(3, 2),game.getBoard().getSpace(4, 2)));
	}
}


class testKnight {
	private Board board;
	
	@Test
	void test1() {
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> knightMethodSpaces;

		//right 
		whatShouldBeThere.add(new Space(2,5));
		whatShouldBeThere.add(new Space(3,6));
		whatShouldBeThere.add(new Space(5,6));
		whatShouldBeThere.add(new Space(6,5));
				

		//up 
		whatShouldBeThere.add(new Space(2,3));
		whatShouldBeThere.add(new Space(3,2));

		//left
		whatShouldBeThere.add(new Space(6,3));
		
		//south
		whatShouldBeThere.add(new Space(5,2));

		Space knightSpace = TestingMethods.addPieceToBoard(new Knight(true), board, 4, 4);
		knightMethodSpaces = ((Knight)knightSpace.getPiece()).getMoveableSpaces(knightSpace,board);
		
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere,knightMethodSpaces));

	}
	
	
	@Test
	void test2() {
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> knightMethodSpaces;

		whatShouldBeThere.add(new Space(6,2));
		whatShouldBeThere.add(new Space(5,1));

		Space knightSpace = TestingMethods.addPieceToBoard(new Knight(true), board, 7, 0);
		knightMethodSpaces = ((Knight)knightSpace.getPiece()).getMoveableSpaces(knightSpace,board);
		
		assertTrue(TestingMethods.areEqual(whatShouldBeThere,knightMethodSpaces));

	}
	

	@Test
	void test3() {
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> knightMethodSpaces;

		whatShouldBeThere.add(new Space(6,2));


		Space knightSpace = TestingMethods.addPieceToBoard(new Knight(true), board, 7, 0);
		TestingMethods.addPieceToBoard(new Pawn(true), board, 5, 1);
		knightMethodSpaces = ((Knight)knightSpace.getPiece()).getMoveableSpaces(knightSpace,board);

		assertTrue(TestingMethods.areEqual(whatShouldBeThere,knightMethodSpaces));

	}
	
	@Test
	void test4() {
		board = new Board(true);
		
		ArrayList<Space> whatShouldBeThere = new ArrayList<Space>();
		ArrayList<Space> knightMethodSpaces;

		whatShouldBeThere.add(new Space(6,2));
		whatShouldBeThere.add(new Space(5,1));

		Space knightSpace = TestingMethods.addPieceToBoard(new Knight(true), board, 7, 0);
		TestingMethods.addPieceToBoard(new Pawn(false), board, 5, 1);
		knightMethodSpaces = ((Knight)knightSpace.getPiece()).getMoveableSpaces(knightSpace,board);

		assertTrue(TestingMethods.areEqual(whatShouldBeThere,knightMethodSpaces));

	}
}
