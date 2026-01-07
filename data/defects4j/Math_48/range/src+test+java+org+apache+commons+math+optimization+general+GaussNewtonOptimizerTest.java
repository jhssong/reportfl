{
  "filepath": "/tmp/Math-48b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 102,
      "end_line": 505,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 104,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 76)",
        "(line 109,col 9)-(line 110,col 88)",
        "(line 112,col 9)-(line 113,col 101)",
        "(line 114,col 9)-(line 114,col 60)",
        "(line 115,col 9)-(line 115,col 65)",
        "(line 116,col 9)-(line 116,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 119,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 62)",
        "(line 126,col 9)-(line 127,col 88)",
        "(line 129,col 9)-(line 130,col 110)",
        "(line 131,col 9)-(line 131,col 60)",
        "(line 132,col 9)-(line 132,col 65)",
        "(line 133,col 9)-(line 133,col 65)",
        "(line 134,col 9)-(line 134,col 65)",
        "(line 135,col 9)-(line 135,col 65)",
        "(line 136,col 9)-(line 136,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 140,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 149,col 58)",
        "(line 151,col 9)-(line 152,col 88)",
        "(line 154,col 9)-(line 156,col 66)",
        "(line 157,col 9)-(line 157,col 60)",
        "(line 158,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 163,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 170,col 36)",
        "(line 172,col 9)-(line 173,col 88)",
        "(line 175,col 9)-(line 176,col 113)",
        "(line 177,col 9)-(line 177,col 60)",
        "(line 178,col 9)-(line 178,col 65)",
        "(line 179,col 9)-(line 179,col 65)",
        "(line 180,col 9)-(line 180,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 184,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 32)",
        "(line 187,col 9)-(line 194,col 66)",
        "(line 196,col 9)-(line 197,col 88)",
        "(line 199,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 202,col 60)",
        "(line 203,col 9)-(line 203,col 66)",
        "(line 204,col 9)-(line 204,col 66)",
        "(line 205,col 9)-(line 205,col 66)",
        "(line 206,col 9)-(line 206,col 66)",
        "(line 207,col 9)-(line 207,col 76)",
        "(line 208,col 9)-(line 208,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 212,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 219,col 37)",
        "(line 221,col 9)-(line 222,col 88)",
        "(line 224,col 9)-(line 224,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 227,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 234,col 44)",
        "(line 236,col 9)-(line 237,col 88)",
        "(line 239,col 9)-(line 241,col 60)",
        "(line 242,col 9)-(line 242,col 60)",
        "(line 243,col 9)-(line 243,col 66)",
        "(line 244,col 9)-(line 244,col 66)",
        "(line 245,col 9)-(line 245,col 66)",
        "(line 246,col 9)-(line 246,col 66)",
        "(line 248,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 256,col 60)",
        "(line 257,col 9)-(line 257,col 60)",
        "(line 258,col 9)-(line 258,col 67)",
        "(line 259,col 9)-(line 259,col 67)",
        "(line 260,col 9)-(line 260,col 67)",
        "(line 261,col 9)-(line 261,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 265,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 272,col 43)",
        "(line 274,col 9)-(line 275,col 88)",
        "(line 277,col 9)-(line 278,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 281,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 289,col 55)",
        "(line 291,col 9)-(line 292,col 88)",
        "(line 294,col 9)-(line 295,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 298,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 304,col 43)",
        "(line 306,col 9)-(line 307,col 88)",
        "(line 309,col 9)-(line 311,col 54)",
        "(line 312,col 9)-(line 312,col 60)",
        "(line 313,col 9)-(line 313,col 64)",
        "(line 314,col 9)-(line 314,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 317,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 323,col 43)",
        "(line 325,col 9)-(line 326,col 88)",
        "(line 328,col 9)-(line 328,col 106)",
        "(line 329,col 9)-(line 329,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes1()",
      "begin_line": 333,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 336,col 93)",
        "(line 338,col 9)-(line 339,col 88)",
        "(line 341,col 9)-(line 342,col 107)",
        "(line 343,col 9)-(line 343,col 60)",
        "(line 344,col 9)-(line 344,col 64)",
        "(line 345,col 9)-(line 345,col 64)",
        "(line 347,col 9)-(line 349,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes2()",
      "begin_line": 352,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 355,col 93)",
        "(line 357,col 9)-(line 358,col 88)",
        "(line 360,col 9)-(line 361,col 107)",
        "(line 362,col 9)-(line 362,col 60)",
        "(line 363,col 9)-(line 363,col 64)",
        "(line 364,col 9)-(line 364,col 64)",
        "(line 366,col 9)-(line 368,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxEvaluations()",
      "begin_line": 371,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 55)",
        "(line 374,col 9)-(line 374,col 38)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 376,col 38)",
        "(line 377,col 9)-(line 377,col 38)",
        "(line 378,col 9)-(line 378,col 38)",
        "(line 380,col 9)-(line 381,col 90)",
        "(line 383,col 9)-(line 385,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 388,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 55)",
        "(line 391,col 9)-(line 391,col 38)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 393,col 9)-(line 393,col 38)",
        "(line 394,col 9)-(line 394,col 38)",
        "(line 395,col 9)-(line 395,col 38)",
        "(line 397,col 9)-(line 398,col 90)",
        "(line 400,col 9)-(line 403,col 64)",
        "(line 404,col 9)-(line 404,col 109)",
        "(line 405,col 9)-(line 405,col 103)",
        "(line 406,col 9)-(line 406,col 82)",
        "(line 407,col 9)-(line 407,col 66)",
        "(line 408,col 9)-(line 408,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 411,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 55)",
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 415,col 52)",
        "(line 416,col 9)-(line 416,col 33)",
        "(line 417,col 9)-(line 417,col 53)",
        "(line 418,col 9)-(line 418,col 34)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 424,col 88)",
        "(line 426,col 9)-(line 426,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingGoodInit()",
      "begin_line": 429,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 55)",
        "(line 432,col 9)-(line 432,col 41)",
        "(line 433,col 9)-(line 433,col 52)",
        "(line 434,col 9)-(line 434,col 33)",
        "(line 435,col 9)-(line 435,col 53)",
        "(line 436,col 9)-(line 436,col 34)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 442,col 88)",
        "(line 444,col 9)-(line 445,col 84)",
        "(line 446,col 9)-(line 446,col 83)",
        "(line 447,col 9)-(line 447,col 83)",
        "(line 448,col 9)-(line 448,col 83)"
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
      "begin_line": 451,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 456,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 457,col 13)-(line 457,col 56)",
        "(line 458,col 13)-(line 458,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 461,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 462,col 13)-(line 462,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 465,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 466,col 13)-(line 470,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-4c4532a6-abdf-4a2b-b4e4-886721746380.value(double[])",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 21)-(line 468,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "circlePoints"
      ],
      "begin_line": 474,
      "end_line": 504,
      "comment": ""
    }
  ]
}