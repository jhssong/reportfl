{
  "filepath": "/tmp/Math-55b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 102,
      "end_line": 487,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 104,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 76)",
        "(line 108,col 9)-(line 108,col 72)",
        "(line 109,col 9)-(line 109,col 89)",
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
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 62)",
        "(line 124,col 9)-(line 124,col 72)",
        "(line 125,col 9)-(line 125,col 89)",
        "(line 126,col 9)-(line 127,col 110)",
        "(line 128,col 9)-(line 128,col 60)",
        "(line 129,col 9)-(line 129,col 65)",
        "(line 130,col 9)-(line 130,col 65)",
        "(line 131,col 9)-(line 131,col 65)",
        "(line 132,col 9)-(line 132,col 65)",
        "(line 133,col 9)-(line 133,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 137,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 146,col 58)",
        "(line 147,col 9)-(line 147,col 72)",
        "(line 148,col 9)-(line 148,col 89)",
        "(line 149,col 9)-(line 151,col 66)",
        "(line 152,col 9)-(line 152,col 60)",
        "(line 153,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 158,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 165,col 36)",
        "(line 166,col 9)-(line 166,col 72)",
        "(line 167,col 9)-(line 167,col 89)",
        "(line 168,col 9)-(line 169,col 113)",
        "(line 170,col 9)-(line 170,col 60)",
        "(line 171,col 9)-(line 171,col 65)",
        "(line 172,col 9)-(line 172,col 65)",
        "(line 173,col 9)-(line 173,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 177,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 32)",
        "(line 180,col 9)-(line 187,col 66)",
        "(line 189,col 9)-(line 189,col 72)",
        "(line 190,col 9)-(line 190,col 89)",
        "(line 191,col 9)-(line 193,col 66)",
        "(line 194,col 9)-(line 194,col 60)",
        "(line 195,col 9)-(line 195,col 66)",
        "(line 196,col 9)-(line 196,col 66)",
        "(line 197,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 198,col 66)",
        "(line 199,col 9)-(line 199,col 76)",
        "(line 200,col 9)-(line 200,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 204,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 211,col 37)",
        "(line 212,col 9)-(line 212,col 72)",
        "(line 213,col 9)-(line 213,col 89)",
        "(line 214,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 222,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 229,col 44)",
        "(line 230,col 9)-(line 230,col 72)",
        "(line 231,col 9)-(line 231,col 89)",
        "(line 232,col 9)-(line 234,col 60)",
        "(line 235,col 9)-(line 235,col 60)",
        "(line 236,col 9)-(line 236,col 66)",
        "(line 237,col 9)-(line 237,col 66)",
        "(line 238,col 9)-(line 238,col 66)",
        "(line 239,col 9)-(line 239,col 66)",
        "(line 241,col 9)-(line 246,col 44)",
        "(line 247,col 9)-(line 249,col 60)",
        "(line 250,col 9)-(line 250,col 60)",
        "(line 251,col 9)-(line 251,col 67)",
        "(line 252,col 9)-(line 252,col 67)",
        "(line 253,col 9)-(line 253,col 67)",
        "(line 254,col 9)-(line 254,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 258,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 265,col 43)",
        "(line 267,col 9)-(line 267,col 72)",
        "(line 268,col 9)-(line 268,col 89)",
        "(line 269,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 278,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 286,col 55)",
        "(line 287,col 9)-(line 287,col 72)",
        "(line 288,col 9)-(line 288,col 89)",
        "(line 289,col 9)-(line 295,col 9)"
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
        "(line 306,col 9)-(line 306,col 72)",
        "(line 307,col 9)-(line 307,col 89)",
        "(line 308,col 9)-(line 310,col 54)",
        "(line 311,col 9)-(line 311,col 60)",
        "(line 312,col 9)-(line 312,col 64)",
        "(line 313,col 9)-(line 313,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 317,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 323,col 43)",
        "(line 325,col 9)-(line 325,col 72)",
        "(line 326,col 9)-(line 326,col 89)",
        "(line 327,col 9)-(line 327,col 106)",
        "(line 328,col 9)-(line 328,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes()",
      "begin_line": 332,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 335,col 93)",
        "(line 336,col 9)-(line 336,col 72)",
        "(line 337,col 9)-(line 337,col 89)",
        "(line 339,col 9)-(line 340,col 107)",
        "(line 341,col 9)-(line 341,col 60)",
        "(line 342,col 9)-(line 342,col 64)",
        "(line 343,col 9)-(line 343,col 64)",
        "(line 345,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxEvaluations()",
      "begin_line": 365,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 55)",
        "(line 368,col 9)-(line 368,col 38)",
        "(line 369,col 9)-(line 369,col 38)",
        "(line 370,col 9)-(line 370,col 38)",
        "(line 371,col 9)-(line 371,col 38)",
        "(line 372,col 9)-(line 372,col 38)",
        "(line 373,col 9)-(line 373,col 72)",
        "(line 374,col 9)-(line 374,col 91)",
        "(line 375,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 385,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 55)",
        "(line 388,col 9)-(line 388,col 38)",
        "(line 389,col 9)-(line 389,col 38)",
        "(line 390,col 9)-(line 390,col 38)",
        "(line 391,col 9)-(line 391,col 38)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 393,col 9)-(line 393,col 72)",
        "(line 394,col 9)-(line 394,col 91)",
        "(line 395,col 9)-(line 398,col 64)",
        "(line 399,col 9)-(line 399,col 109)",
        "(line 400,col 9)-(line 400,col 103)",
        "(line 401,col 9)-(line 401,col 82)",
        "(line 402,col 9)-(line 402,col 66)",
        "(line 403,col 9)-(line 403,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 406,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 55)",
        "(line 409,col 9)-(line 439,col 10)",
        "(line 440,col 9)-(line 440,col 52)",
        "(line 441,col 9)-(line 441,col 33)",
        "(line 442,col 9)-(line 442,col 53)",
        "(line 443,col 9)-(line 443,col 34)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 72)",
        "(line 448,col 9)-(line 448,col 89)",
        "(line 449,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 457,col 84)",
        "(line 458,col 9)-(line 458,col 83)",
        "(line 459,col 9)-(line 459,col 83)",
        "(line 460,col 9)-(line 460,col 83)"
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
      "begin_line": 464,
      "end_line": 486,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 469,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 56)",
        "(line 471,col 13)-(line 471,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 474,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 475,col 13)-(line 475,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 478,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 479,col 13)-(line 484,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-54bb5cfe-102c-43b6-9d30-601a456d3626.value(double[])",
      "begin_line": 481,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 21)-(line 482,col 45)"
      ]
    }
  ]
}