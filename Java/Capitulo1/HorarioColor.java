/*
 * HorarioColor.java
 * 
 * Este programa es mi horario con colores.
 * 
 * @author 2022 Rocio Alejandra Gonfaus Luengo
 * 
 */


public class HorarioColor {
	
	public static void main (String[] args) {
		
		System.out.println("┌───────┬─────────┬─────────┬────────────┬─────────┬─────────┐");
		System.out.println("│       │  \033[97mLunes\033[39;49m  │  \033[97mMartes\033[39;49m │  \033[97mMiércoles\033[39;49m │  \033[97mJueves\033[39;49m │ \033[97mViernes\033[39;49m │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ \033[97m15:15\033[39;49m │  \033[96mS.Inf\033[39;49m  │   \033[91mProg\033[39;49m  │    \033[96mS.Inf\033[39;49m   │   \033[91mProg\033[39;49m  │   \033[91mProg\033[39;49m  │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ \033[97m16:15\033[39;49m │   \033[91mProg\033[39;49m  │   \033[91mProg\033[39;49m  │     \033[93mFOL\033[39;49m    │   \033[91mProg\033[39;49m  │   \033[91mProg\033[39;49m  │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ \033[97m17:15\033[39;49m │   \033[91mProg\033[39;49m  │    \033[95mLM\033[39;49m   │     \033[93mFOL\033[39;49m    │    \033[92mBD\033[39;49m   │    \033[92mBD\033[39;49m   │");
		System.out.println("├───────┼─────────┴─────────┴────────────┴─────────┴─────────┤");
		System.out.println("│ \033[97m18:15\033[39;49m │                      \033[97mDESCANSO\033[39;49m                      │");
		System.out.println("├───────┼─────────┬─────────┬────────────┬─────────┬─────────┤");
		System.out.println("│ \033[97m18:30\033[39;49m │   \033[93mFOL\033[39;49m   │    \033[95mLM\033[39;49m   │     \033[94mED\033[39;49m     │    \033[92mBD\033[39;49m   │    \033[92mBD\033[39;49m   │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ \033[97m19:30\033[39;49m │    \033[92mBD\033[39;49m   │  \033[96mS.Inf\033[39;49m  │     \033[94mED\033[39;49m     │  \033[96mS.Inf\033[39;49m  │    \033[95mLM\033[39;49m   │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ \033[97m20:30\033[39;49m │    \033[92mBD\033[39;49m   │  \033[96mS.Inf\033[39;49m  │     \033[94mED\033[39;49m     │  \033[96mS.Inf\033[39;49m  │    \033[95mLM\033[39;49m   │");
		System.out.println("└───────┴─────────┴─────────┴────────────┴─────────┴─────────┘");
	}
}