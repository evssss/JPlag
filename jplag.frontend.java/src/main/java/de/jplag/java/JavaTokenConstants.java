package de.jplag.java;

import de.jplag.TokenConstants;

public interface JavaTokenConstants extends TokenConstants {

    // @formatter:off
    final static int J_PACKAGE = 2;				// check
    final static int J_IMPORT = 3;				// check
    final static int J_CLASS_BEGIN = 4;			// check
    final static int J_CLASS_END = 5;			// check
    final static int J_METHOD_BEGIN = 6;		// check
    final static int J_METHOD_END = 7;			// check
    final static int J_VARDEF = 8;				// check
    final static int J_SYNC_BEGIN = 9;			// check
    final static int J_SYNC_END = 10;			// check
    final static int J_DO_BEGIN = 11;			// check
    final static int J_DO_END = 12;				// check
    final static int J_WHILE_BEGIN = 13;		// check
    final static int J_WHILE_END = 14;			// check
    final static int J_FOR_BEGIN = 15;			// check
    final static int J_FOR_END = 16;			// check
    final static int J_SWITCH_BEGIN = 17;		// check
    final static int J_SWITCH_END = 18;			// check
    final static int J_CASE = 19;				// check
    final static int J_TRY_BEGIN = 20;			// check
    final static int J_CATCH_BEGIN = 21;    	// check
    final static int J_CATCH_END = 22;      	// check
    final static int J_FINALLY = 23;			// check
    final static int J_IF_BEGIN = 24;			// check
    final static int J_ELSE = 25;				// check
    final static int J_IF_END = 26;				// check
    final static int J_COND = 27;				// check
    final static int J_BREAK = 28;				// check
    final static int J_CONTINUE = 29;			// check
    final static int J_RETURN = 30;				// check
    final static int J_THROW = 31;				// check
    final static int J_IN_CLASS_BEGIN = 32;		//
    final static int J_IN_CLASS_END = 33;		//
    final static int J_APPLY = 34;				// check
    final static int J_NEWCLASS = 35;			// check
    final static int J_NEWARRAY = 36;			// check
    final static int J_ASSIGN = 37;				// check
    final static int J_INTERFACE_BEGIN = 38;	// check
    final static int J_INTERFACE_END = 39;		// check
    final static int J_CONSTR_BEGIN = 40;		//
    final static int J_CONSTR_END = 41;			//
    final static int J_INIT_BEGIN = 42;			// check
    final static int J_INIT_END = 43;			// check
    final static int J_VOID = 44;				//
    final static int J_ARRAY_INIT_BEGIN = 45;	// check
    final static int J_ARRAY_INIT_END = 46; 	// check

    // new in 1.5:
    final static int J_ENUM_BEGIN = 47;			// check
    final static int J_ENUM_CLASS_BEGIN = 48;	// ?? doesn't exist in JAVAC
    final static int J_ENUM_END = 49;			// check
    final static int J_GENERIC = 50;			// check
    final static int J_ASSERT = 51;				// check

    final static int J_ANNO = 52;				// check
    final static int J_ANNO_MARKER = 53;		// ??
    final static int J_ANNO_M_BEGIN = 54;		// ??
    final static int J_ANNO_M_END = 55;			// ??
    final static int J_ANNO_T_BEGIN = 56;		// check
    final static int J_ANNO_T_END = 57;			// check
    final static int J_ANNO_C_BEGIN = 58;		// ??
    final static int J_ANNO_C_END = 59;			// ??

    // new in 1.7
    final static int J_TRY_WITH_RESOURCE = 60; 	// check

    // new in 1.9
    final static int J_REQUIRES = 61; 	        // check
    final static int J_PROVIDES = 62; 	        // check
    final static int J_EXPORTS = 63; 	        // check
    final static int J_MODULE_BEGIN = 64;       // check
    final static int J_MODULE_END = 65; 	    // check

    final static int NUM_DIFF_TOKENS = 66;	    // @formatter:on
}
