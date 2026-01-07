{
  "filepath": "/tmp/Math-77b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 101,
      "end_line": 591,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.GaussNewtonOptimizerTest(java.lang.String)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 108,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 110,col 76)",
        "(line 111,col 9)-(line 111,col 72)",
        "(line 112,col 9)-(line 112,col 40)",
        "(line 113,col 9)-(line 113,col 89)",
        "(line 114,col 9)-(line 115,col 96)",
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 121,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 62)",
        "(line 127,col 9)-(line 127,col 72)",
        "(line 128,col 9)-(line 128,col 40)",
        "(line 129,col 9)-(line 129,col 89)",
        "(line 130,col 9)-(line 131,col 105)",
        "(line 132,col 9)-(line 132,col 53)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 137,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 141,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 149,col 58)",
        "(line 150,col 9)-(line 150,col 72)",
        "(line 151,col 9)-(line 151,col 40)",
        "(line 152,col 9)-(line 152,col 89)",
        "(line 153,col 9)-(line 155,col 66)",
        "(line 156,col 9)-(line 156,col 53)",
        "(line 157,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 162,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 72)",
        "(line 170,col 9)-(line 170,col 40)",
        "(line 171,col 9)-(line 171,col 89)",
        "(line 172,col 9)-(line 173,col 108)",
        "(line 174,col 9)-(line 174,col 53)",
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 181,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 190,col 66)",
        "(line 192,col 9)-(line 192,col 72)",
        "(line 193,col 9)-(line 193,col 40)",
        "(line 194,col 9)-(line 194,col 89)",
        "(line 195,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 198,col 53)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 59)",
        "(line 203,col 9)-(line 203,col 69)",
        "(line 204,col 9)-(line 204,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 208,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 214,col 37)",
        "(line 215,col 9)-(line 215,col 72)",
        "(line 216,col 9)-(line 216,col 40)",
        "(line 217,col 9)-(line 217,col 89)",
        "(line 218,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 228,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 234,col 44)",
        "(line 235,col 9)-(line 235,col 72)",
        "(line 236,col 9)-(line 236,col 40)",
        "(line 237,col 9)-(line 237,col 89)",
        "(line 238,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 241,col 53)",
        "(line 242,col 9)-(line 242,col 59)",
        "(line 243,col 9)-(line 243,col 59)",
        "(line 244,col 9)-(line 244,col 59)",
        "(line 245,col 9)-(line 245,col 59)",
        "(line 247,col 9)-(line 252,col 44)",
        "(line 253,col 9)-(line 255,col 60)",
        "(line 256,col 9)-(line 256,col 53)",
        "(line 257,col 9)-(line 257,col 60)",
        "(line 258,col 9)-(line 258,col 60)",
        "(line 259,col 9)-(line 259,col 60)",
        "(line 260,col 9)-(line 260,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 264,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 270,col 43)",
        "(line 272,col 9)-(line 272,col 72)",
        "(line 273,col 9)-(line 273,col 40)",
        "(line 274,col 9)-(line 274,col 89)",
        "(line 275,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 287,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 294,col 55)",
        "(line 295,col 9)-(line 295,col 72)",
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 89)",
        "(line 298,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 309,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 314,col 43)",
        "(line 316,col 9)-(line 316,col 72)",
        "(line 317,col 9)-(line 317,col 40)",
        "(line 318,col 9)-(line 318,col 89)",
        "(line 319,col 9)-(line 321,col 54)",
        "(line 322,col 9)-(line 322,col 53)",
        "(line 323,col 9)-(line 323,col 57)",
        "(line 324,col 9)-(line 324,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 328,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 333,col 43)",
        "(line 335,col 9)-(line 335,col 72)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 337,col 9)-(line 337,col 89)",
        "(line 338,col 9)-(line 338,col 101)",
        "(line 339,col 9)-(line 339,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes()",
      "begin_line": 343,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 345,col 93)",
        "(line 346,col 9)-(line 346,col 72)",
        "(line 347,col 9)-(line 347,col 40)",
        "(line 348,col 9)-(line 348,col 89)",
        "(line 350,col 9)-(line 351,col 102)",
        "(line 352,col 9)-(line 352,col 53)",
        "(line 353,col 9)-(line 353,col 57)",
        "(line 354,col 9)-(line 354,col 57)",
        "(line 356,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxIterations()",
      "begin_line": 380,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 37)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 384,col 38)",
        "(line 385,col 9)-(line 385,col 38)",
        "(line 386,col 9)-(line 386,col 38)",
        "(line 387,col 9)-(line 387,col 72)",
        "(line 388,col 9)-(line 388,col 40)",
        "(line 389,col 9)-(line 389,col 91)",
        "(line 390,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 402,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 37)",
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 408,col 38)",
        "(line 409,col 9)-(line 409,col 72)",
        "(line 410,col 9)-(line 410,col 40)",
        "(line 411,col 9)-(line 411,col 91)",
        "(line 412,col 9)-(line 415,col 64)",
        "(line 416,col 9)-(line 416,col 98)",
        "(line 417,col 9)-(line 417,col 103)",
        "(line 418,col 9)-(line 418,col 75)",
        "(line 419,col 9)-(line 419,col 59)",
        "(line 420,col 9)-(line 420,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 423,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 37)",
        "(line 425,col 9)-(line 455,col 10)",
        "(line 456,col 9)-(line 456,col 52)",
        "(line 457,col 9)-(line 457,col 33)",
        "(line 458,col 9)-(line 458,col 53)",
        "(line 459,col 9)-(line 459,col 34)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 72)",
        "(line 464,col 9)-(line 464,col 40)",
        "(line 465,col 9)-(line 465,col 89)",
        "(line 466,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 476,col 79)",
        "(line 477,col 9)-(line 477,col 76)",
        "(line 478,col 9)-(line 478,col 76)",
        "(line 479,col 9)-(line 479,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 483,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 485,
      "end_line": 485,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 488,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 56)",
        "(line 490,col 13)-(line 490,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 493,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 497,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 498,col 13)-(line 503,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 499,
      "end_line": 499,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-6330daed-ad99-4b7b-bd4d-56752b21edfc.value(double[])",
      "begin_line": 500,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 501,col 21)-(line 501,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 508,
      "end_line": 585,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Circle()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 514,col 13)-(line 514,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 517,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 518,col 13)-(line 518,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getN()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 13)-(line 522,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 525,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 526,col 13)-(line 526,col 25)",
        "(line 527,col 13)-(line 529,col 13)",
        "(line 530,col 13)-(line 530,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 533,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 34)",
        "(line 536,col 13)-(line 536,col 83)",
        "(line 539,col 13)-(line 539,col 28)",
        "(line 540,col 13)-(line 540,col 28)",
        "(line 541,col 13)-(line 545,col 13)",
        "(line 546,col 13)-(line 546,col 22)",
        "(line 547,col 13)-(line 547,col 22)",
        "(line 550,col 13)-(line 550,col 51)",
        "(line 551,col 13)-(line 556,col 12)",
        "(line 558,col 13)-(line 558,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.value(double[])",
      "begin_line": 562,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 83)",
        "(line 565,col 13)-(line 565,col 46)",
        "(line 567,col 13)-(line 567,col 59)",
        "(line 568,col 13)-(line 570,col 13)",
        "(line 572,col 13)-(line 572,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian()",
      "begin_line": 576,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 582,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 578,
      "end_line": 578,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Anonymous-0f367e4a-f6d4-4c75-9f23-9b10e392be59.value(double[])",
      "begin_line": 579,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 580,col 21)-(line 580,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.suite()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 61)"
      ]
    }
  ]
}