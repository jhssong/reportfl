{
  "filepath": "/tmp/Math-73b/src/test/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 100,
      "end_line": 495,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.NonLinearConjugateGradientOptimizerTest(java.lang.String)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTrivial()",
      "begin_line": 107,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 109,col 76)",
        "(line 110,col 9)-(line 111,col 92)",
        "(line 112,col 9)-(line 112,col 40)",
        "(line 113,col 9)-(line 113,col 86)",
        "(line 114,col 9)-(line 115,col 79)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation()",
      "begin_line": 120,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 62)",
        "(line 126,col 9)-(line 127,col 92)",
        "(line 128,col 9)-(line 128,col 40)",
        "(line 129,col 9)-(line 129,col 86)",
        "(line 130,col 9)-(line 131,col 82)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNoDependency()",
      "begin_line": 138,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 146,col 58)",
        "(line 147,col 9)-(line 148,col 92)",
        "(line 149,col 9)-(line 149,col 40)",
        "(line 150,col 9)-(line 150,col 86)",
        "(line 151,col 9)-(line 152,col 94)",
        "(line 153,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testOneSet()",
      "begin_line": 158,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 164,col 36)",
        "(line 165,col 9)-(line 166,col 92)",
        "(line 167,col 9)-(line 167,col 40)",
        "(line 168,col 9)-(line 168,col 86)",
        "(line 169,col 9)-(line 170,col 85)",
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 173,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTwoSets()",
      "begin_line": 177,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 186,col 66)",
        "(line 188,col 9)-(line 189,col 92)",
        "(line 190,col 9)-(line 190,col 40)",
        "(line 191,col 9)-(line 202,col 11)",
        "(line 203,col 9)-(line 203,col 88)",
        "(line 205,col 9)-(line 206,col 94)",
        "(line 207,col 9)-(line 207,col 59)",
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 69)",
        "(line 212,col 9)-(line 212,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-aab41ea3-5f0f-4523-934e-f0492d26eefa.precondition(double[], double[])",
      "begin_line": 192,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 193,col 17)-(line 193,col 39)",
        "(line 194,col 17)-(line 194,col 30)",
        "(line 195,col 17)-(line 195,col 30)",
        "(line 196,col 17)-(line 196,col 30)",
        "(line 197,col 17)-(line 197,col 30)",
        "(line 198,col 17)-(line 198,col 52)",
        "(line 199,col 17)-(line 199,col 28)",
        "(line 200,col 17)-(line 200,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 216,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 222,col 37)",
        "(line 223,col 9)-(line 224,col 92)",
        "(line 225,col 9)-(line 225,col 40)",
        "(line 226,col 9)-(line 226,col 86)",
        "(line 227,col 9)-(line 228,col 89)",
        "(line 229,col 9)-(line 229,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 232,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 238,col 44)",
        "(line 239,col 9)-(line 240,col 92)",
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 242,col 88)",
        "(line 243,col 9)-(line 243,col 47)",
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 246,col 46)",
        "(line 247,col 9)-(line 248,col 89)",
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 250,col 58)",
        "(line 251,col 9)-(line 251,col 58)",
        "(line 252,col 9)-(line 252,col 58)",
        "(line 254,col 9)-(line 259,col 44)",
        "(line 260,col 9)-(line 261,col 89)",
        "(line 262,col 9)-(line 262,col 60)",
        "(line 263,col 9)-(line 263,col 60)",
        "(line 264,col 9)-(line 264,col 60)",
        "(line 265,col 9)-(line 265,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 269,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 276,col 43)",
        "(line 278,col 9)-(line 279,col 92)",
        "(line 280,col 9)-(line 280,col 40)",
        "(line 281,col 9)-(line 281,col 86)",
        "(line 282,col 9)-(line 283,col 88)",
        "(line 284,col 9)-(line 284,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 288,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 296,col 55)",
        "(line 297,col 9)-(line 298,col 92)",
        "(line 299,col 9)-(line 299,col 40)",
        "(line 300,col 9)-(line 300,col 86)",
        "(line 301,col 9)-(line 302,col 94)",
        "(line 303,col 9)-(line 303,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 306,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 311,col 43)",
        "(line 313,col 9)-(line 314,col 92)",
        "(line 315,col 9)-(line 315,col 40)",
        "(line 316,col 9)-(line 316,col 86)",
        "(line 317,col 9)-(line 318,col 82)",
        "(line 319,col 9)-(line 319,col 57)",
        "(line 320,col 9)-(line 320,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 324,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 329,col 43)",
        "(line 331,col 9)-(line 332,col 92)",
        "(line 333,col 9)-(line 333,col 40)",
        "(line 334,col 9)-(line 334,col 86)",
        "(line 335,col 9)-(line 336,col 82)",
        "(line 337,col 9)-(line 337,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 341,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 37)",
        "(line 343,col 9)-(line 343,col 38)",
        "(line 344,col 9)-(line 344,col 38)",
        "(line 345,col 9)-(line 345,col 38)",
        "(line 346,col 9)-(line 346,col 38)",
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 349,col 92)",
        "(line 350,col 9)-(line 350,col 40)",
        "(line 351,col 9)-(line 351,col 88)",
        "(line 352,col 9)-(line 352,col 47)",
        "(line 353,col 9)-(line 353,col 44)",
        "(line 354,col 9)-(line 354,col 44)",
        "(line 355,col 9)-(line 355,col 46)",
        "(line 356,col 9)-(line 357,col 91)",
        "(line 358,col 9)-(line 358,col 103)",
        "(line 359,col 9)-(line 359,col 69)",
        "(line 360,col 9)-(line 360,col 53)",
        "(line 361,col 9)-(line 361,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 364,
      "end_line": 414,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 369,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 56)",
        "(line 371,col 13)-(line 371,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient(double[])",
      "begin_line": 374,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 375,col 13)-(line 375,col 48)",
        "(line 376,col 13)-(line 378,col 13)",
        "(line 379,col 13)-(line 379,col 56)",
        "(line 380,col 13)-(line 382,col 13)",
        "(line 383,col 13)-(line 383,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 386,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 387,col 13)-(line 387,col 52)",
        "(line 388,col 13)-(line 388,col 27)",
        "(line 389,col 13)-(line 392,col 13)",
        "(line 393,col 13)-(line 393,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient()",
      "begin_line": 396,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 397,col 13)-(line 402,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-320fcaa3-57f1-4c10-948a-492201a1a8ac.value(double[])",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 21)-(line 400,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.partialDerivative(int)",
      "begin_line": 405,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 406,col 13)-(line 411,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-1ea92678-17fa-4c47-be50-921b71d601dc.value(double[])",
      "begin_line": 408,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 409,col 21)-(line 409,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 416,
      "end_line": 493,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Circle()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 13)-(line 423,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 13)-(line 427,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 430,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 25)",
        "(line 432,col 13)-(line 434,col 13)",
        "(line 435,col 13)-(line 435,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.gradient(double[])",
      "begin_line": 438,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 441,col 13)-(line 441,col 75)",
        "(line 442,col 13)-(line 442,col 46)",
        "(line 445,col 13)-(line 445,col 28)",
        "(line 446,col 13)-(line 446,col 28)",
        "(line 447,col 13)-(line 451,col 13)",
        "(line 452,col 13)-(line 452,col 22)",
        "(line 453,col 13)-(line 453,col 22)",
        "(line 455,col 13)-(line 455,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.value(double[])",
      "begin_line": 459,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 462,col 13)-(line 462,col 83)",
        "(line 463,col 13)-(line 463,col 46)",
        "(line 465,col 13)-(line 465,col 27)",
        "(line 466,col 13)-(line 469,col 13)",
        "(line 471,col 13)-(line 471,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.gradient()",
      "begin_line": 475,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 481,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Anonymous-fb736158-3cd0-49f3-80a9-c8616a903419.value(double[])",
      "begin_line": 478,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 21)-(line 479,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.partialDerivative(int)",
      "begin_line": 484,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 485,col 13)-(line 490,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Anonymous-5d0963b0-95fd-49a4-abd0-f4823a827c68.value(double[])",
      "begin_line": 487,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 21)-(line 488,col 46)"
      ]
    }
  ]
}