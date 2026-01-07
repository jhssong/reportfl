{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractLeastSquaresOptimizerAbstractTest"
      ],
      "begin_line": 104,
      "end_line": 412,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.createOptimizer()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testConstraintsUnsupported()",
      "begin_line": 111,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 118,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testNonInvertible()",
      "begin_line": 121,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 132,col 37)",
        "(line 134,col 9)-(line 134,col 68)",
        "(line 135,col 9)-(line 141,col 77)",
        "(line 142,col 9)-(line 142,col 95)",
        "(line 144,col 9)-(line 144,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 147,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 55)",
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 38)",
        "(line 154,col 9)-(line 154,col 38)",
        "(line 155,col 9)-(line 157,col 65)",
        "(line 158,col 9)-(line 160,col 64)",
        "(line 161,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 165,col 9)-(line 167,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math3.optim.nonlinear.vector.ModelFunction, org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian, double, int, double, double, double, boolean)",
      "begin_line": 170,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testBevington()",
      "begin_line": 203,
      "end_line": 274,
      "comment": "\n     * Non-linear test case: fitting of decay curve (from Chapter 8 of\n     * Bevington\u0027s textbook, \"Data reduction and analysis for the physical sciences\").\n     * XXX The expected (\"reference\") values may not be accurate and the tolerance too\n     * relaxed for this test to be currently really useful (the issue is under\n     * investigation).\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 220,col 10)",
        "(line 222,col 9)-(line 222,col 64)",
        "(line 224,col 9)-(line 224,col 45)",
        "(line 225,col 9)-(line 225,col 49)",
        "(line 226,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 234,col 48)",
        "(line 236,col 9)-(line 242,col 90)",
        "(line 244,col 9)-(line 244,col 53)",
        "(line 245,col 9)-(line 245,col 78)",
        "(line 247,col 9)-(line 247,col 85)",
        "(line 248,col 9)-(line 254,col 10)",
        "(line 256,col 9)-(line 256,col 54)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 266,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.testCircleFitting2()",
      "begin_line": 276,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 39)",
        "(line 279,col 9)-(line 279,col 39)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 284,col 9)-(line 284,col 36)",
        "(line 285,col 9)-(line 288,col 51)",
        "(line 289,col 9)-(line 289,col 71)",
        "(line 291,col 9)-(line 291,col 33)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 297,col 47)",
        "(line 299,col 9)-(line 300,col 48)",
        "(line 301,col 9)-(line 306,col 88)",
        "(line 308,col 9)-(line 308,col 55)",
        "(line 311,col 9)-(line 311,col 96)",
        "(line 314,col 9)-(line 314,col 85)",
        "(line 315,col 9)-(line 315,col 85)",
        "(line 316,col 9)-(line 316,col 84)"
      ]
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 319,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 40)",
        "(line 325,col 13)-(line 325,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 26)",
        "(line 330,col 13)-(line 330,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunction()",
      "begin_line": 333,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 334,col 13)-(line 342,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-2a9bbc3d-e441-49af-83d2-176c039f7d5d.value(double[])",
      "begin_line": 335,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 336,col 25)-(line 336,col 63)",
        "(line 337,col 25)-(line 339,col 25)",
        "(line 340,col 25)-(line 340,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunctionJacobian()",
      "begin_line": 345,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 346,col 13)-(line 356,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-d071d476-2018-45ce-b269-252d3f8e3e98.value(double[])",
      "begin_line": 347,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 348,col 25)-(line 348,col 70)",
        "(line 349,col 25)-(line 353,col 25)",
        "(line 354,col 25)-(line 354,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BevingtonProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 360,
      "end_line": 411,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.BevingtonProblem()",
      "begin_line": 364,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 43)",
        "(line 366,col 13)-(line 366,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.addPoint(double, double)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 24)",
        "(line 371,col 13)-(line 371,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunction()",
      "begin_line": 374,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 375,col 13)-(line 386,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-91f042bd-ff8e-431b-b719-cd5b0fa4ca97.value(double[])",
      "begin_line": 376,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 377,col 25)-(line 377,col 66)",
        "(line 378,col 25)-(line 383,col 25)",
        "(line 384,col 25)-(line 384,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunctionJacobian()",
      "begin_line": 389,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 409,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-3650a732-4540-4ecb-8caf-9c56c468f724.value(double[])",
      "begin_line": 391,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 392,col 25)-(line 392,col 73)",
        "(line 394,col 25)-(line 406,col 25)",
        "(line 407,col 25)-(line 407,col 40)"
      ]
    }
  ]
}