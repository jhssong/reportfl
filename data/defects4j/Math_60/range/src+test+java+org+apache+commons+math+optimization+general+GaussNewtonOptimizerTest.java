{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 102,
      "end_line": 492,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.GaussNewtonOptimizerTest(java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 109,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 111,col 76)",
        "(line 112,col 9)-(line 112,col 72)",
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 89)",
        "(line 115,col 9)-(line 116,col 96)",
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 122,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 62)",
        "(line 128,col 9)-(line 128,col 72)",
        "(line 129,col 9)-(line 129,col 41)",
        "(line 130,col 9)-(line 130,col 89)",
        "(line 131,col 9)-(line 132,col 105)",
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 142,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 150,col 58)",
        "(line 151,col 9)-(line 151,col 72)",
        "(line 152,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 153,col 89)",
        "(line 154,col 9)-(line 156,col 66)",
        "(line 157,col 9)-(line 157,col 53)",
        "(line 158,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 163,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 169,col 36)",
        "(line 170,col 9)-(line 170,col 72)",
        "(line 171,col 9)-(line 171,col 41)",
        "(line 172,col 9)-(line 172,col 89)",
        "(line 173,col 9)-(line 174,col 108)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 178,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 182,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 32)",
        "(line 184,col 9)-(line 191,col 66)",
        "(line 193,col 9)-(line 193,col 72)",
        "(line 194,col 9)-(line 194,col 41)",
        "(line 195,col 9)-(line 195,col 89)",
        "(line 196,col 9)-(line 198,col 66)",
        "(line 199,col 9)-(line 199,col 53)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 59)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 204,col 69)",
        "(line 205,col 9)-(line 205,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 209,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 72)",
        "(line 217,col 9)-(line 217,col 41)",
        "(line 218,col 9)-(line 218,col 89)",
        "(line 219,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 227,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 233,col 44)",
        "(line 234,col 9)-(line 234,col 72)",
        "(line 235,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 236,col 89)",
        "(line 237,col 9)-(line 239,col 60)",
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 241,col 59)",
        "(line 242,col 9)-(line 242,col 59)",
        "(line 243,col 9)-(line 243,col 59)",
        "(line 244,col 9)-(line 244,col 59)",
        "(line 246,col 9)-(line 251,col 44)",
        "(line 252,col 9)-(line 254,col 60)",
        "(line 255,col 9)-(line 255,col 53)",
        "(line 256,col 9)-(line 256,col 60)",
        "(line 257,col 9)-(line 257,col 60)",
        "(line 258,col 9)-(line 258,col 60)",
        "(line 259,col 9)-(line 259,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 263,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 269,col 43)",
        "(line 271,col 9)-(line 271,col 72)",
        "(line 272,col 9)-(line 272,col 41)",
        "(line 273,col 9)-(line 273,col 89)",
        "(line 274,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 283,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 290,col 55)",
        "(line 291,col 9)-(line 291,col 72)",
        "(line 292,col 9)-(line 292,col 41)",
        "(line 293,col 9)-(line 293,col 89)",
        "(line 294,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 303,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 308,col 43)",
        "(line 310,col 9)-(line 310,col 72)",
        "(line 311,col 9)-(line 311,col 41)",
        "(line 312,col 9)-(line 312,col 89)",
        "(line 313,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 316,col 53)",
        "(line 317,col 9)-(line 317,col 57)",
        "(line 318,col 9)-(line 318,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 322,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 327,col 43)",
        "(line 329,col 9)-(line 329,col 72)",
        "(line 330,col 9)-(line 330,col 41)",
        "(line 331,col 9)-(line 331,col 89)",
        "(line 332,col 9)-(line 332,col 101)",
        "(line 333,col 9)-(line 333,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes()",
      "begin_line": 337,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 339,col 93)",
        "(line 340,col 9)-(line 340,col 72)",
        "(line 341,col 9)-(line 341,col 41)",
        "(line 342,col 9)-(line 342,col 89)",
        "(line 344,col 9)-(line 345,col 102)",
        "(line 346,col 9)-(line 346,col 53)",
        "(line 347,col 9)-(line 347,col 57)",
        "(line 348,col 9)-(line 348,col 57)",
        "(line 350,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxEvaluations()",
      "begin_line": 370,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 55)",
        "(line 372,col 9)-(line 372,col 38)",
        "(line 373,col 9)-(line 373,col 38)",
        "(line 374,col 9)-(line 374,col 38)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 376,col 38)",
        "(line 377,col 9)-(line 377,col 72)",
        "(line 378,col 9)-(line 378,col 41)",
        "(line 379,col 9)-(line 379,col 91)",
        "(line 380,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 390,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 55)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 393,col 9)-(line 393,col 38)",
        "(line 394,col 9)-(line 394,col 38)",
        "(line 395,col 9)-(line 395,col 38)",
        "(line 396,col 9)-(line 396,col 38)",
        "(line 397,col 9)-(line 397,col 72)",
        "(line 398,col 9)-(line 398,col 41)",
        "(line 399,col 9)-(line 399,col 91)",
        "(line 400,col 9)-(line 403,col 64)",
        "(line 404,col 9)-(line 404,col 102)",
        "(line 405,col 9)-(line 405,col 103)",
        "(line 406,col 9)-(line 406,col 75)",
        "(line 407,col 9)-(line 407,col 59)",
        "(line 408,col 9)-(line 408,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 411,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 55)",
        "(line 413,col 9)-(line 443,col 10)",
        "(line 444,col 9)-(line 444,col 52)",
        "(line 445,col 9)-(line 445,col 33)",
        "(line 446,col 9)-(line 446,col 53)",
        "(line 447,col 9)-(line 447,col 34)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 72)",
        "(line 452,col 9)-(line 452,col 41)",
        "(line 453,col 9)-(line 453,col 89)",
        "(line 454,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 462,col 79)",
        "(line 463,col 9)-(line 463,col 76)",
        "(line 464,col 9)-(line 464,col 76)",
        "(line 465,col 9)-(line 465,col 76)"
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
      "begin_line": 469,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 475,col 13)-(line 475,col 56)",
        "(line 476,col 13)-(line 476,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 479,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 480,col 13)-(line 480,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 483,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 489,col 14)"
      ]
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
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-75f1da1e-66be-4a0c-a8d6-8bd7e909c1a5.value(double[])",
      "begin_line": 486,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 21)-(line 487,col 45)"
      ]
    }
  ]
}