{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 101,
      "end_line": 476,
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
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 110,col 76)",
        "(line 111,col 9)-(line 111,col 72)",
        "(line 112,col 9)-(line 112,col 89)",
        "(line 113,col 9)-(line 114,col 101)",
        "(line 115,col 9)-(line 115,col 53)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 120,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 62)",
        "(line 126,col 9)-(line 126,col 72)",
        "(line 127,col 9)-(line 127,col 89)",
        "(line 128,col 9)-(line 129,col 110)",
        "(line 130,col 9)-(line 130,col 53)",
        "(line 131,col 9)-(line 131,col 58)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 139,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 148,col 72)",
        "(line 149,col 9)-(line 149,col 89)",
        "(line 150,col 9)-(line 152,col 66)",
        "(line 153,col 9)-(line 153,col 53)",
        "(line 154,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 159,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 165,col 36)",
        "(line 166,col 9)-(line 166,col 72)",
        "(line 167,col 9)-(line 167,col 89)",
        "(line 168,col 9)-(line 169,col 113)",
        "(line 170,col 9)-(line 170,col 53)",
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 173,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 177,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 32)",
        "(line 179,col 9)-(line 186,col 66)",
        "(line 188,col 9)-(line 188,col 72)",
        "(line 189,col 9)-(line 189,col 89)",
        "(line 190,col 9)-(line 192,col 66)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 194,col 59)",
        "(line 195,col 9)-(line 195,col 59)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 197,col 9)-(line 197,col 59)",
        "(line 198,col 9)-(line 198,col 69)",
        "(line 199,col 9)-(line 199,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 203,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 209,col 37)",
        "(line 210,col 9)-(line 210,col 72)",
        "(line 211,col 9)-(line 211,col 89)",
        "(line 212,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 220,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 226,col 44)",
        "(line 227,col 9)-(line 227,col 72)",
        "(line 228,col 9)-(line 228,col 89)",
        "(line 229,col 9)-(line 231,col 60)",
        "(line 232,col 9)-(line 232,col 53)",
        "(line 233,col 9)-(line 233,col 59)",
        "(line 234,col 9)-(line 234,col 59)",
        "(line 235,col 9)-(line 235,col 59)",
        "(line 236,col 9)-(line 236,col 59)",
        "(line 238,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 246,col 60)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 248,col 60)",
        "(line 249,col 9)-(line 249,col 60)",
        "(line 250,col 9)-(line 250,col 60)",
        "(line 251,col 9)-(line 251,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 255,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 261,col 43)",
        "(line 263,col 9)-(line 263,col 72)",
        "(line 264,col 9)-(line 264,col 89)",
        "(line 265,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 274,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 281,col 55)",
        "(line 282,col 9)-(line 282,col 72)",
        "(line 283,col 9)-(line 283,col 89)",
        "(line 284,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 293,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 298,col 43)",
        "(line 300,col 9)-(line 300,col 72)",
        "(line 301,col 9)-(line 301,col 89)",
        "(line 302,col 9)-(line 304,col 54)",
        "(line 305,col 9)-(line 305,col 53)",
        "(line 306,col 9)-(line 306,col 57)",
        "(line 307,col 9)-(line 307,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 311,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 316,col 43)",
        "(line 318,col 9)-(line 318,col 72)",
        "(line 319,col 9)-(line 319,col 89)",
        "(line 320,col 9)-(line 320,col 106)",
        "(line 321,col 9)-(line 321,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes()",
      "begin_line": 325,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 327,col 93)",
        "(line 328,col 9)-(line 328,col 72)",
        "(line 329,col 9)-(line 329,col 89)",
        "(line 331,col 9)-(line 332,col 107)",
        "(line 333,col 9)-(line 333,col 53)",
        "(line 334,col 9)-(line 334,col 57)",
        "(line 335,col 9)-(line 335,col 57)",
        "(line 337,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxEvaluations()",
      "begin_line": 357,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 55)",
        "(line 359,col 9)-(line 359,col 38)",
        "(line 360,col 9)-(line 360,col 38)",
        "(line 361,col 9)-(line 361,col 38)",
        "(line 362,col 9)-(line 362,col 38)",
        "(line 363,col 9)-(line 363,col 38)",
        "(line 364,col 9)-(line 364,col 72)",
        "(line 365,col 9)-(line 365,col 91)",
        "(line 366,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 376,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 55)",
        "(line 378,col 9)-(line 378,col 38)",
        "(line 379,col 9)-(line 379,col 38)",
        "(line 380,col 9)-(line 380,col 38)",
        "(line 381,col 9)-(line 381,col 38)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 72)",
        "(line 384,col 9)-(line 384,col 91)",
        "(line 385,col 9)-(line 388,col 64)",
        "(line 389,col 9)-(line 389,col 102)",
        "(line 390,col 9)-(line 390,col 103)",
        "(line 391,col 9)-(line 391,col 75)",
        "(line 392,col 9)-(line 392,col 59)",
        "(line 393,col 9)-(line 393,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 396,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 55)",
        "(line 398,col 9)-(line 428,col 10)",
        "(line 429,col 9)-(line 429,col 52)",
        "(line 430,col 9)-(line 430,col 33)",
        "(line 431,col 9)-(line 431,col 53)",
        "(line 432,col 9)-(line 432,col 34)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 72)",
        "(line 437,col 9)-(line 437,col 89)",
        "(line 438,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 446,col 84)",
        "(line 447,col 9)-(line 447,col 76)",
        "(line 448,col 9)-(line 448,col 76)",
        "(line 449,col 9)-(line 449,col 76)"
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
      "begin_line": 453,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 458,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 56)",
        "(line 460,col 13)-(line 460,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 463,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 464,col 13)-(line 464,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 467,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 468,col 13)-(line 473,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-f61be5b3-0536-4fd8-85db-1355a73a98c2.value(double[])",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 21)-(line 471,col 45)"
      ]
    }
  ]
}