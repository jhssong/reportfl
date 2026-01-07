{
  "filepath": "/tmp/Math-14b/src/test/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractLeastSquaresOptimizerAbstractTest"
      ],
      "begin_line": 105,
      "end_line": 403,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.createOptimizer()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testNonInvertible()",
      "begin_line": 112,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 123,col 37)",
        "(line 125,col 9)-(line 125,col 68)",
        "(line 126,col 9)-(line 132,col 77)",
        "(line 133,col 9)-(line 133,col 95)",
        "(line 135,col 9)-(line 135,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 138,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 55)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 38)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 38)",
        "(line 145,col 9)-(line 145,col 38)",
        "(line 146,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 151,col 64)",
        "(line 152,col 9)-(line 154,col 64)",
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 158,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math3.optim.nonlinear.vector.ModelFunction, org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian, double, int, double, double, double, boolean)",
      "begin_line": 161,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testBevington()",
      "begin_line": 194,
      "end_line": 265,
      "comment": "\n     * Non-linear test case: fitting of decay curve (from Chapter 8 of\n     * Bevington\u0027s textbook, \"Data reduction and analysis for the physical sciences\").\n     * XXX The expected (\"reference\") values may not be accurate and the tolerance too\n     * relaxed for this test to be currently really useful (the issue is under\n     * investigation).\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 211,col 10)",
        "(line 213,col 9)-(line 213,col 64)",
        "(line 215,col 9)-(line 215,col 45)",
        "(line 216,col 9)-(line 216,col 49)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 225,col 48)",
        "(line 227,col 9)-(line 233,col 90)",
        "(line 235,col 9)-(line 235,col 53)",
        "(line 236,col 9)-(line 236,col 78)",
        "(line 238,col 9)-(line 238,col 85)",
        "(line 239,col 9)-(line 245,col 10)",
        "(line 247,col 9)-(line 247,col 54)",
        "(line 250,col 9)-(line 253,col 9)",
        "(line 257,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testCircleFitting2()",
      "begin_line": 267,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 39)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 271,col 33)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 38)",
        "(line 275,col 9)-(line 275,col 36)",
        "(line 276,col 9)-(line 279,col 51)",
        "(line 280,col 9)-(line 280,col 71)",
        "(line 282,col 9)-(line 282,col 33)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 288,col 9)-(line 288,col 47)",
        "(line 290,col 9)-(line 291,col 48)",
        "(line 292,col 9)-(line 297,col 88)",
        "(line 299,col 9)-(line 299,col 55)",
        "(line 302,col 9)-(line 302,col 96)",
        "(line 305,col 9)-(line 305,col 85)",
        "(line 306,col 9)-(line 306,col 85)",
        "(line 307,col 9)-(line 307,col 84)"
      ]
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 310,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 40)",
        "(line 316,col 13)-(line 316,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 26)",
        "(line 321,col 13)-(line 321,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunction()",
      "begin_line": 324,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 325,col 13)-(line 333,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-aff48000-1a13-48f9-8223-61106333f25a.value(double[])",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 327,col 25)-(line 327,col 63)",
        "(line 328,col 25)-(line 330,col 25)",
        "(line 331,col 25)-(line 331,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunctionJacobian()",
      "begin_line": 336,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 337,col 13)-(line 347,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-144e2c6c-f5ce-4438-9f36-31aaf0ab8476.value(double[])",
      "begin_line": 338,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 339,col 25)-(line 339,col 70)",
        "(line 340,col 25)-(line 344,col 25)",
        "(line 345,col 25)-(line 345,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BevingtonProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 351,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.BevingtonProblem()",
      "begin_line": 355,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 43)",
        "(line 357,col 13)-(line 357,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.addPoint(double, double)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 24)",
        "(line 362,col 13)-(line 362,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunction()",
      "begin_line": 365,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 366,col 13)-(line 377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-bf4c176e-c3f5-423d-9f0d-c40809cef412.value(double[])",
      "begin_line": 367,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 368,col 25)-(line 368,col 66)",
        "(line 369,col 25)-(line 374,col 25)",
        "(line 375,col 25)-(line 375,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunctionJacobian()",
      "begin_line": 380,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 381,col 13)-(line 400,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-87da27bf-f2ce-4e50-ab8b-ffda8decfc19.value(double[])",
      "begin_line": 382,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 383,col 25)-(line 383,col 73)",
        "(line 385,col 25)-(line 397,col 25)",
        "(line 398,col 25)-(line 398,col 40)"
      ]
    }
  ]
}