import static org.junit.Assert.*;

import org.junit.Test;

public class MoveWordsTest {

	@Test
	public void testTijeras() {
		String primero = new Move("TIJERAS").getMove();
		String segundo;
		int result;
		
		for (int i = 0; i < 5; i++) {
			
			
			
			switch (i) {
				case 0:  segundo = new Move("TIJERAS").getMove();
							assertEquals(MoveWords.EMPATE,MoveWords.checkWinner(primero,segundo));
				break;
				case 1: 	segundo = new Move("PAPEL").getMove();
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 2: 	segundo = new Move("PIEDRA").getMove();
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 3: 	segundo = new Move("LAGARTIJA").getMove(); 
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 4: 	segundo = new Move("SPOCK").getMove(); 
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
			}
		}
	}
	
	@Test
	public void testPapel() {
		String primero = new Move("PAPEL").getMove();
		String segundo;
		
		for (int i = 0; i < 5; i++) {
			
			switch (i) {
				case 0:  segundo = new Move("TIJERAS").getMove();
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 1: 	segundo = new Move("PAPEL").getMove();
							assertEquals(MoveWords.EMPATE,MoveWords.checkWinner(primero,segundo));
				break;
				case 2: 	segundo = new Move("PIEDRA").getMove();
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 3: 	segundo = new Move("LAGARTIJA").getMove(); 
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 4: 	segundo = new Move("SPOCK").getMove(); 
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
			}
		}
	}
	
	@Test
	public void testPiedra() {
		String primero = new Move("PIEDRA").getMove();
		String segundo;
		
		for (int i = 0; i < 5; i++) {
			
			switch (i) {
				case 0:  segundo = new Move("TIJERAS").getMove();
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 1: 	segundo = new Move("PAPEL").getMove();
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 2: 	segundo = new Move("PIEDRA").getMove();
							assertEquals(MoveWords.EMPATE,MoveWords.checkWinner(primero,segundo));
				break;
				case 3: 	segundo = new Move("LAGARTIJA").getMove(); 
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 4: 	segundo = new Move("SPOCK").getMove(); 
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
			}
		}
	}
	
	@Test
	public void testLagartija() {
		String primero = new Move("LAGARTIJA").getMove();
		String segundo;
		
		for (int i = 0; i < 5; i++) {
			
			switch (i) {
				case 0:  segundo = new Move("TIJERAS").getMove();
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 1: 	segundo = new Move("PAPEL").getMove();
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 2: 	segundo = new Move("PIEDRA").getMove();
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 3: 	segundo = new Move("LAGARTIJA").getMove(); 
							assertEquals(MoveWords.EMPATE,MoveWords.checkWinner(primero,segundo));
				break;
				case 4: 	segundo = new Move("SPOCK").getMove(); 
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
			}
		}
	}
	
	@Test
	public void testSpock() {
		String primero = new Move("SPOCK").getMove();
		String segundo;
		
		for (int i = 0; i < 5; i++) {
			
			switch (i) {
				case 0:  segundo = new Move("TIJERAS").getMove();
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 1: 	segundo = new Move("PAPEL").getMove();
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 2: 	segundo = new Move("PIEDRA").getMove();
							assertEquals(MoveWords.GANA,MoveWords.checkWinner(primero,segundo));
				break;
				case 3: 	segundo = new Move("LAGARTIJA").getMove(); 
							assertEquals(MoveWords.PIERDE,MoveWords.checkWinner(primero,segundo));
				break;
				case 4: 	segundo = new Move("SPOCK").getMove(); 
							assertEquals(MoveWords.EMPATE,MoveWords.checkWinner(primero,segundo));
				break;
			}
		}
	}
	
}
