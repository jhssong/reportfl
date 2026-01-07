{
  "filepath": "/tmp/Math-10b/src/test/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractLeastSquaresOptimizerAbstractTest"
      ],
      "begin_line": 107,
      "end_line": 415,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.createOptimizer()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testConstraintsUnsupported()",
      "begin_line": 114,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 121,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testNonInvertible()",
      "begin_line": 124,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 135,col 37)",
        "(line 137,col 9)-(line 137,col 68)",
        "(line 138,col 9)-(line 144,col 77)",
        "(line 145,col 9)-(line 145,col 95)",
        "(line 147,col 9)-(line 147,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 150,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 153,col 38)",
        "(line 154,col 9)-(line 154,col 38)",
        "(line 155,col 9)-(line 155,col 38)",
        "(line 156,col 9)-(line 156,col 38)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 158,col 9)-(line 160,col 65)",
        "(line 161,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 166,col 64)",
        "(line 167,col 9)-(line 167,col 35)",
        "(line 168,col 9)-(line 170,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math3.optim.nonlinear.vector.ModelFunction, org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian, double, int, double, double, double, boolean)",
      "begin_line": 173,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testBevington()",
      "begin_line": 206,
      "end_line": 277,
      "comment": "\n     * Non-linear test case: fitting of decay curve (from Chapter 8 of\n     * Bevington\u0027s textbook, \"Data reduction and analysis for the physical sciences\").\n     * XXX The expected (\"reference\") values may not be accurate and the tolerance too\n     * relaxed for this test to be currently really useful (the issue is under\n     * investigation).\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 223,col 10)",
        "(line 225,col 9)-(line 225,col 64)",
        "(line 227,col 9)-(line 227,col 45)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 237,col 48)",
        "(line 239,col 9)-(line 245,col 90)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 248,col 78)",
        "(line 250,col 9)-(line 250,col 85)",
        "(line 251,col 9)-(line 257,col 10)",
        "(line 259,col 9)-(line 259,col 54)",
        "(line 262,col 9)-(line 265,col 9)",
        "(line 269,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testCircleFitting2()",
      "begin_line": 279,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 39)",
        "(line 282,col 9)-(line 282,col 39)",
        "(line 283,col 9)-(line 283,col 33)",
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 38)",
        "(line 287,col 9)-(line 287,col 36)",
        "(line 288,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 292,col 71)",
        "(line 294,col 9)-(line 294,col 33)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 300,col 9)-(line 300,col 47)",
        "(line 302,col 9)-(line 303,col 48)",
        "(line 304,col 9)-(line 309,col 88)",
        "(line 311,col 9)-(line 311,col 55)",
        "(line 314,col 9)-(line 314,col 96)",
        "(line 317,col 9)-(line 317,col 85)",
        "(line 318,col 9)-(line 318,col 85)",
        "(line 319,col 9)-(line 319,col 84)"
      ]
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 322,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 326,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 40)",
        "(line 328,col 13)-(line 328,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 331,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 26)",
        "(line 333,col 13)-(line 333,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunction()",
      "begin_line": 336,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 337,col 13)-(line 345,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-53b29ca9-cf59-475f-8ee4-6d81d26aa25b.value(double[])",
      "begin_line": 338,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 339,col 25)-(line 339,col 63)",
        "(line 340,col 25)-(line 342,col 25)",
        "(line 343,col 25)-(line 343,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunctionJacobian()",
      "begin_line": 348,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 349,col 13)-(line 359,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-b00ceca1-9734-4610-9abe-1003d9d72f94.value(double[])",
      "begin_line": 350,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 351,col 25)-(line 351,col 70)",
        "(line 352,col 25)-(line 356,col 25)",
        "(line 357,col 25)-(line 357,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BevingtonProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 363,
      "end_line": 414,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.BevingtonProblem()",
      "begin_line": 367,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 43)",
        "(line 369,col 13)-(line 369,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.addPoint(double, double)",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 373,col 13)-(line 373,col 24)",
        "(line 374,col 13)-(line 374,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunction()",
      "begin_line": 377,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 389,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-59667bfd-2eaf-490e-8138-f8359348f3c6.value(double[])",
      "begin_line": 379,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 380,col 25)-(line 380,col 66)",
        "(line 381,col 25)-(line 386,col 25)",
        "(line 387,col 25)-(line 387,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunctionJacobian()",
      "begin_line": 392,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 393,col 13)-(line 412,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-880fccec-beae-46bd-be3a-021453e20a71.value(double[])",
      "begin_line": 394,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 395,col 25)-(line 395,col 73)",
        "(line 397,col 25)-(line 409,col 25)",
        "(line 410,col 25)-(line 410,col 40)"
      ]
    }
  ]
}