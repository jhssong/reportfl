{
  "filepath": "/tmp/Math-75b/src/test/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 102,
      "end_line": 501,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
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
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 38)",
        "(line 181,col 9)-(line 188,col 66)",
        "(line 190,col 9)-(line 191,col 92)",
        "(line 192,col 9)-(line 192,col 40)",
        "(line 193,col 9)-(line 204,col 11)",
        "(line 205,col 9)-(line 205,col 88)",
        "(line 207,col 9)-(line 208,col 94)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 59)",
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 213,col 69)",
        "(line 214,col 9)-(line 214,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-c2318ece-c18b-461e-9858-9d31ee6f7f38.precondition(double[], double[])",
      "begin_line": 194,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 195,col 17)-(line 195,col 39)",
        "(line 196,col 17)-(line 196,col 30)",
        "(line 197,col 17)-(line 197,col 30)",
        "(line 198,col 17)-(line 198,col 30)",
        "(line 199,col 17)-(line 199,col 30)",
        "(line 200,col 17)-(line 200,col 52)",
        "(line 201,col 17)-(line 201,col 28)",
        "(line 202,col 17)-(line 202,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 218,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 224,col 37)",
        "(line 225,col 9)-(line 226,col 92)",
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 228,col 86)",
        "(line 229,col 9)-(line 230,col 89)",
        "(line 231,col 9)-(line 231,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 234,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 242,col 92)",
        "(line 243,col 9)-(line 243,col 40)",
        "(line 244,col 9)-(line 244,col 88)",
        "(line 245,col 9)-(line 245,col 47)",
        "(line 246,col 9)-(line 246,col 44)",
        "(line 247,col 9)-(line 247,col 44)",
        "(line 248,col 9)-(line 248,col 46)",
        "(line 249,col 9)-(line 250,col 89)",
        "(line 251,col 9)-(line 251,col 58)",
        "(line 252,col 9)-(line 252,col 58)",
        "(line 253,col 9)-(line 253,col 58)",
        "(line 254,col 9)-(line 254,col 58)",
        "(line 256,col 9)-(line 261,col 44)",
        "(line 262,col 9)-(line 263,col 89)",
        "(line 264,col 9)-(line 264,col 60)",
        "(line 265,col 9)-(line 265,col 60)",
        "(line 266,col 9)-(line 266,col 60)",
        "(line 267,col 9)-(line 267,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 271,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 278,col 43)",
        "(line 280,col 9)-(line 281,col 92)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 86)",
        "(line 284,col 9)-(line 285,col 88)",
        "(line 286,col 9)-(line 286,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 290,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 298,col 55)",
        "(line 299,col 9)-(line 300,col 92)",
        "(line 301,col 9)-(line 301,col 40)",
        "(line 302,col 9)-(line 302,col 86)",
        "(line 303,col 9)-(line 304,col 94)",
        "(line 305,col 9)-(line 305,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 308,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 313,col 43)",
        "(line 315,col 9)-(line 316,col 92)",
        "(line 317,col 9)-(line 317,col 40)",
        "(line 318,col 9)-(line 318,col 86)",
        "(line 319,col 9)-(line 320,col 82)",
        "(line 321,col 9)-(line 321,col 57)",
        "(line 322,col 9)-(line 322,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 326,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 331,col 43)",
        "(line 333,col 9)-(line 334,col 92)",
        "(line 335,col 9)-(line 335,col 40)",
        "(line 336,col 9)-(line 336,col 86)",
        "(line 337,col 9)-(line 338,col 82)",
        "(line 339,col 9)-(line 339,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 343,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 37)",
        "(line 345,col 9)-(line 345,col 38)",
        "(line 346,col 9)-(line 346,col 38)",
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 348,col 38)",
        "(line 349,col 9)-(line 349,col 38)",
        "(line 350,col 9)-(line 351,col 92)",
        "(line 352,col 9)-(line 352,col 40)",
        "(line 353,col 9)-(line 353,col 88)",
        "(line 354,col 9)-(line 354,col 47)",
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 356,col 44)",
        "(line 357,col 9)-(line 357,col 46)",
        "(line 358,col 9)-(line 359,col 91)",
        "(line 360,col 9)-(line 360,col 103)",
        "(line 361,col 9)-(line 361,col 69)",
        "(line 362,col 9)-(line 362,col 53)",
        "(line 363,col 9)-(line 363,col 53)"
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
      "begin_line": 366,
      "end_line": 416,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 371,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 56)",
        "(line 373,col 13)-(line 373,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient(double[])",
      "begin_line": 376,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 377,col 13)-(line 377,col 48)",
        "(line 378,col 13)-(line 380,col 13)",
        "(line 381,col 13)-(line 381,col 56)",
        "(line 382,col 13)-(line 384,col 13)",
        "(line 385,col 13)-(line 385,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 388,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 389,col 13)-(line 389,col 52)",
        "(line 390,col 13)-(line 390,col 27)",
        "(line 391,col 13)-(line 394,col 13)",
        "(line 395,col 13)-(line 395,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient()",
      "begin_line": 398,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 404,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 400,
      "end_line": 400,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-e213a668-d30f-4bd9-b66a-9fdb174ab54d.value(double[])",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 21)-(line 402,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.partialDerivative(int)",
      "begin_line": 407,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 408,col 13)-(line 413,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-f03a311c-d1ae-48b5-a6f9-f964f5bf2be3.value(double[])",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 21)-(line 411,col 46)"
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
      "begin_line": 418,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Circle()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 13)-(line 425,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 13)-(line 429,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 432,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 433,col 13)-(line 433,col 25)",
        "(line 434,col 13)-(line 436,col 13)",
        "(line 437,col 13)-(line 437,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.gradient(double[])",
      "begin_line": 440,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 75)",
        "(line 444,col 13)-(line 444,col 46)",
        "(line 447,col 13)-(line 447,col 28)",
        "(line 448,col 13)-(line 448,col 28)",
        "(line 449,col 13)-(line 453,col 13)",
        "(line 454,col 13)-(line 454,col 22)",
        "(line 455,col 13)-(line 455,col 22)",
        "(line 457,col 13)-(line 457,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.value(double[])",
      "begin_line": 461,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 464,col 13)-(line 464,col 83)",
        "(line 465,col 13)-(line 465,col 46)",
        "(line 467,col 13)-(line 467,col 27)",
        "(line 468,col 13)-(line 471,col 13)",
        "(line 473,col 13)-(line 473,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.gradient()",
      "begin_line": 477,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 478,col 13)-(line 483,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Anonymous-3415fc4c-7654-4281-b5b8-5b5a6bcbebda.value(double[])",
      "begin_line": 480,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 481,col 21)-(line 481,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.partialDerivative(int)",
      "begin_line": 486,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 487,col 13)-(line 492,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Circle.Anonymous-be855209-f233-4aa0-a948-6e96b9c1e532.value(double[])",
      "begin_line": 489,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 21)-(line 490,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.suite()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 76)"
      ]
    }
  ]
}