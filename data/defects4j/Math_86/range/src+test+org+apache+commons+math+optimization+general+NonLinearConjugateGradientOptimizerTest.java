{
  "filepath": "/tmp/Math-86b/src/test/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 102,
      "end_line": 506,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.NonLinearConjugateGradientOptimizerTest(java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTrivial()",
      "begin_line": 109,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 111,col 76)",
        "(line 112,col 9)-(line 113,col 92)",
        "(line 114,col 9)-(line 114,col 40)",
        "(line 115,col 9)-(line 115,col 86)",
        "(line 116,col 9)-(line 117,col 79)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation()",
      "begin_line": 122,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 62)",
        "(line 128,col 9)-(line 129,col 92)",
        "(line 130,col 9)-(line 130,col 40)",
        "(line 131,col 9)-(line 131,col 86)",
        "(line 132,col 9)-(line 133,col 82)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNoDependency()",
      "begin_line": 140,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 148,col 58)",
        "(line 149,col 9)-(line 150,col 92)",
        "(line 151,col 9)-(line 151,col 40)",
        "(line 152,col 9)-(line 152,col 86)",
        "(line 153,col 9)-(line 154,col 94)",
        "(line 155,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testOneSet()",
      "begin_line": 160,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 166,col 36)",
        "(line 167,col 9)-(line 168,col 92)",
        "(line 169,col 9)-(line 169,col 40)",
        "(line 170,col 9)-(line 170,col 86)",
        "(line 171,col 9)-(line 172,col 85)",
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 175,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTwoSets()",
      "begin_line": 179,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 38)",
        "(line 181,col 9)-(line 188,col 66)",
        "(line 190,col 9)-(line 191,col 92)",
        "(line 192,col 9)-(line 192,col 40)",
        "(line 193,col 9)-(line 205,col 11)",
        "(line 206,col 9)-(line 206,col 88)",
        "(line 208,col 9)-(line 209,col 94)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 59)",
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 213,col 59)",
        "(line 214,col 9)-(line 214,col 69)",
        "(line 215,col 9)-(line 215,col 69)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-c1f351f0-0594-46ee-9b22-067207c1ffe7.precondition(double[], double[])",
      "begin_line": 195,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 196,col 17)-(line 196,col 39)",
        "(line 197,col 17)-(line 197,col 30)",
        "(line 198,col 17)-(line 198,col 30)",
        "(line 199,col 17)-(line 199,col 30)",
        "(line 200,col 17)-(line 200,col 30)",
        "(line 201,col 17)-(line 201,col 52)",
        "(line 202,col 17)-(line 202,col 28)",
        "(line 203,col 17)-(line 203,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 219,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 227,col 92)",
        "(line 228,col 9)-(line 228,col 40)",
        "(line 229,col 9)-(line 229,col 86)",
        "(line 230,col 9)-(line 231,col 89)",
        "(line 232,col 9)-(line 232,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 235,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 241,col 44)",
        "(line 242,col 9)-(line 243,col 92)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 88)",
        "(line 246,col 9)-(line 246,col 47)",
        "(line 247,col 9)-(line 247,col 44)",
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 249,col 46)",
        "(line 250,col 9)-(line 251,col 89)",
        "(line 252,col 9)-(line 252,col 58)",
        "(line 253,col 9)-(line 253,col 58)",
        "(line 254,col 9)-(line 254,col 58)",
        "(line 255,col 9)-(line 255,col 58)",
        "(line 257,col 9)-(line 262,col 44)",
        "(line 263,col 9)-(line 264,col 89)",
        "(line 265,col 9)-(line 265,col 60)",
        "(line 266,col 9)-(line 266,col 60)",
        "(line 267,col 9)-(line 267,col 60)",
        "(line 268,col 9)-(line 268,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 272,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 279,col 43)",
        "(line 281,col 9)-(line 282,col 92)",
        "(line 283,col 9)-(line 283,col 40)",
        "(line 284,col 9)-(line 284,col 86)",
        "(line 285,col 9)-(line 286,col 88)",
        "(line 287,col 9)-(line 287,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 291,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 299,col 55)",
        "(line 300,col 9)-(line 301,col 92)",
        "(line 302,col 9)-(line 302,col 40)",
        "(line 303,col 9)-(line 303,col 86)",
        "(line 304,col 9)-(line 305,col 94)",
        "(line 306,col 9)-(line 306,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 309,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 314,col 43)",
        "(line 316,col 9)-(line 317,col 92)",
        "(line 318,col 9)-(line 318,col 40)",
        "(line 319,col 9)-(line 319,col 86)",
        "(line 320,col 9)-(line 321,col 82)",
        "(line 322,col 9)-(line 322,col 57)",
        "(line 323,col 9)-(line 323,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 327,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 332,col 43)",
        "(line 334,col 9)-(line 335,col 92)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 337,col 9)-(line 337,col 86)",
        "(line 338,col 9)-(line 339,col 82)",
        "(line 340,col 9)-(line 340,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 344,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 37)",
        "(line 346,col 9)-(line 346,col 38)",
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 348,col 38)",
        "(line 349,col 9)-(line 349,col 38)",
        "(line 350,col 9)-(line 350,col 38)",
        "(line 351,col 9)-(line 352,col 92)",
        "(line 353,col 9)-(line 353,col 40)",
        "(line 354,col 9)-(line 354,col 88)",
        "(line 355,col 9)-(line 355,col 47)",
        "(line 356,col 9)-(line 356,col 44)",
        "(line 357,col 9)-(line 357,col 44)",
        "(line 358,col 9)-(line 358,col 46)",
        "(line 359,col 9)-(line 360,col 91)",
        "(line 361,col 9)-(line 361,col 103)",
        "(line 362,col 9)-(line 362,col 69)",
        "(line 363,col 9)-(line 363,col 53)",
        "(line 364,col 9)-(line 364,col 53)"
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
      "begin_line": 367,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 373,col 13)-(line 373,col 56)",
        "(line 374,col 13)-(line 374,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient(double[])",
      "begin_line": 377,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 48)",
        "(line 379,col 13)-(line 381,col 13)",
        "(line 382,col 13)-(line 382,col 56)",
        "(line 383,col 13)-(line 385,col 13)",
        "(line 386,col 13)-(line 386,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 389,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 52)",
        "(line 391,col 13)-(line 391,col 27)",
        "(line 392,col 13)-(line 395,col 13)",
        "(line 396,col 13)-(line 396,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient()",
      "begin_line": 399,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 400,col 13)-(line 405,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-741e8752-10ea-47a7-9166-936895317131.value(double[])",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 21)-(line 403,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.partialDerivative(int)",
      "begin_line": 408,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 409,col 13)-(line 414,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-4f20d717-e477-4724-afb4-df956a6b800c.value(double[])",
      "begin_line": 411,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 21)-(line 412,col 46)"
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
      "begin_line": 419,
      "end_line": 500,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Circle()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 426,col 13)-(line 426,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.getN()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 13)-(line 434,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 437,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 438,col 13)-(line 438,col 25)",
        "(line 439,col 13)-(line 441,col 13)",
        "(line 442,col 13)-(line 442,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.gradient(double[])",
      "begin_line": 445,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 448,col 13)-(line 448,col 75)",
        "(line 449,col 13)-(line 449,col 46)",
        "(line 452,col 13)-(line 452,col 28)",
        "(line 453,col 13)-(line 453,col 28)",
        "(line 454,col 13)-(line 458,col 13)",
        "(line 459,col 13)-(line 459,col 22)",
        "(line 460,col 13)-(line 460,col 22)",
        "(line 462,col 13)-(line 462,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.value(double[])",
      "begin_line": 466,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 469,col 13)-(line 469,col 83)",
        "(line 470,col 13)-(line 470,col 46)",
        "(line 472,col 13)-(line 472,col 27)",
        "(line 473,col 13)-(line 476,col 13)",
        "(line 478,col 13)-(line 478,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.gradient()",
      "begin_line": 482,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 483,col 13)-(line 488,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Anonymous-1bec7d98-663c-44bf-afec-8ae8bdccd990.value(double[])",
      "begin_line": 485,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 21)-(line 486,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.partialDerivative(int)",
      "begin_line": 491,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 497,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Anonymous-a1ce5b94-397a-4cf3-ad5f-8d27ab5e6e0e.value(double[])",
      "begin_line": 494,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 21)-(line 495,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.suite()",
      "begin_line": 502,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 76)"
      ]
    }
  ]
}