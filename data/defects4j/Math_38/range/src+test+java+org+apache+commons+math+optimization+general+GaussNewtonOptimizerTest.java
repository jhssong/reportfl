{
  "filepath": "/tmp/Math-38b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 100,
      "end_line": 503,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 102,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 76)",
        "(line 107,col 9)-(line 108,col 88)",
        "(line 110,col 9)-(line 111,col 101)",
        "(line 112,col 9)-(line 112,col 60)",
        "(line 113,col 9)-(line 113,col 65)",
        "(line 114,col 9)-(line 114,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 117,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 62)",
        "(line 124,col 9)-(line 125,col 88)",
        "(line 127,col 9)-(line 128,col 110)",
        "(line 129,col 9)-(line 129,col 60)",
        "(line 130,col 9)-(line 130,col 65)",
        "(line 131,col 9)-(line 131,col 65)",
        "(line 132,col 9)-(line 132,col 65)",
        "(line 133,col 9)-(line 133,col 65)",
        "(line 134,col 9)-(line 134,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 138,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 147,col 58)",
        "(line 149,col 9)-(line 150,col 88)",
        "(line 152,col 9)-(line 154,col 66)",
        "(line 155,col 9)-(line 155,col 60)",
        "(line 156,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 161,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 168,col 36)",
        "(line 170,col 9)-(line 171,col 88)",
        "(line 173,col 9)-(line 174,col 113)",
        "(line 175,col 9)-(line 175,col 60)",
        "(line 176,col 9)-(line 176,col 65)",
        "(line 177,col 9)-(line 177,col 65)",
        "(line 178,col 9)-(line 178,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 182,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 192,col 66)",
        "(line 194,col 9)-(line 195,col 88)",
        "(line 197,col 9)-(line 199,col 66)",
        "(line 200,col 9)-(line 200,col 60)",
        "(line 201,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 202,col 66)",
        "(line 203,col 9)-(line 203,col 66)",
        "(line 204,col 9)-(line 204,col 66)",
        "(line 205,col 9)-(line 205,col 76)",
        "(line 206,col 9)-(line 206,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 210,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 217,col 37)",
        "(line 219,col 9)-(line 220,col 88)",
        "(line 222,col 9)-(line 222,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 225,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 232,col 44)",
        "(line 234,col 9)-(line 235,col 88)",
        "(line 237,col 9)-(line 239,col 60)",
        "(line 240,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 241,col 66)",
        "(line 242,col 9)-(line 242,col 66)",
        "(line 243,col 9)-(line 243,col 66)",
        "(line 244,col 9)-(line 244,col 66)",
        "(line 246,col 9)-(line 251,col 44)",
        "(line 252,col 9)-(line 254,col 60)",
        "(line 255,col 9)-(line 255,col 60)",
        "(line 256,col 9)-(line 256,col 67)",
        "(line 257,col 9)-(line 257,col 67)",
        "(line 258,col 9)-(line 258,col 67)",
        "(line 259,col 9)-(line 259,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 263,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 270,col 43)",
        "(line 272,col 9)-(line 273,col 88)",
        "(line 275,col 9)-(line 276,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 279,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 287,col 55)",
        "(line 289,col 9)-(line 290,col 88)",
        "(line 292,col 9)-(line 293,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 296,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 302,col 43)",
        "(line 304,col 9)-(line 305,col 88)",
        "(line 307,col 9)-(line 309,col 54)",
        "(line 310,col 9)-(line 310,col 60)",
        "(line 311,col 9)-(line 311,col 64)",
        "(line 312,col 9)-(line 312,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 315,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 321,col 43)",
        "(line 323,col 9)-(line 324,col 88)",
        "(line 326,col 9)-(line 326,col 106)",
        "(line 327,col 9)-(line 327,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes1()",
      "begin_line": 331,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 334,col 93)",
        "(line 336,col 9)-(line 337,col 88)",
        "(line 339,col 9)-(line 340,col 107)",
        "(line 341,col 9)-(line 341,col 60)",
        "(line 342,col 9)-(line 342,col 64)",
        "(line 343,col 9)-(line 343,col 64)",
        "(line 345,col 9)-(line 347,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes2()",
      "begin_line": 350,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 353,col 93)",
        "(line 355,col 9)-(line 356,col 88)",
        "(line 358,col 9)-(line 359,col 107)",
        "(line 360,col 9)-(line 360,col 60)",
        "(line 361,col 9)-(line 361,col 64)",
        "(line 362,col 9)-(line 362,col 64)",
        "(line 364,col 9)-(line 366,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxEvaluations()",
      "begin_line": 369,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 55)",
        "(line 372,col 9)-(line 372,col 38)",
        "(line 373,col 9)-(line 373,col 38)",
        "(line 374,col 9)-(line 374,col 38)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 376,col 38)",
        "(line 378,col 9)-(line 379,col 90)",
        "(line 381,col 9)-(line 383,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 386,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 389,col 38)",
        "(line 390,col 9)-(line 390,col 38)",
        "(line 391,col 9)-(line 391,col 38)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 393,col 9)-(line 393,col 38)",
        "(line 395,col 9)-(line 396,col 90)",
        "(line 398,col 9)-(line 401,col 64)",
        "(line 402,col 9)-(line 402,col 109)",
        "(line 403,col 9)-(line 403,col 103)",
        "(line 404,col 9)-(line 404,col 82)",
        "(line 405,col 9)-(line 405,col 66)",
        "(line 406,col 9)-(line 406,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 409,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 55)",
        "(line 412,col 9)-(line 412,col 41)",
        "(line 413,col 9)-(line 413,col 52)",
        "(line 414,col 9)-(line 414,col 33)",
        "(line 415,col 9)-(line 415,col 53)",
        "(line 416,col 9)-(line 416,col 34)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 422,col 88)",
        "(line 424,col 9)-(line 424,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingGoodInit()",
      "begin_line": 427,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 55)",
        "(line 430,col 9)-(line 430,col 41)",
        "(line 431,col 9)-(line 431,col 52)",
        "(line 432,col 9)-(line 432,col 33)",
        "(line 433,col 9)-(line 433,col 53)",
        "(line 434,col 9)-(line 434,col 34)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 440,col 88)",
        "(line 442,col 9)-(line 443,col 84)",
        "(line 444,col 9)-(line 444,col 83)",
        "(line 445,col 9)-(line 445,col 83)",
        "(line 446,col 9)-(line 446,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorFunction",
        "java.io.Serializable"
      ],
      "begin_line": 449,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 454,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 56)",
        "(line 456,col 13)-(line 456,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 459,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 460,col 13)-(line 460,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 463,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 464,col 13)-(line 468,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-33fa42a8-066a-48f3-8cf6-43315fcd822f.value(double[])",
      "begin_line": 465,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 466,col 21)-(line 466,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "circlePoints"
      ],
      "begin_line": 472,
      "end_line": 502,
      "comment": ""
    }
  ]
}