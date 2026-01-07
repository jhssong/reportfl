{
  "filepath": "/tmp/Math-23b/src/test/java/org/apache/commons/math3/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 394,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testTrivial()",
      "begin_line": 97,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 100,col 76)",
        "(line 101,col 9)-(line 103,col 88)",
        "(line 104,col 9)-(line 105,col 84)",
        "(line 106,col 9)-(line 106,col 65)",
        "(line 107,col 9)-(line 107,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation()",
      "begin_line": 110,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 62)",
        "(line 116,col 9)-(line 118,col 88)",
        "(line 119,col 9)-(line 120,col 87)",
        "(line 121,col 9)-(line 121,col 65)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 123,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testNoDependency()",
      "begin_line": 127,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 139,col 88)",
        "(line 140,col 9)-(line 141,col 99)",
        "(line 142,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testOneSet()",
      "begin_line": 147,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 153,col 36)",
        "(line 154,col 9)-(line 156,col 88)",
        "(line 157,col 9)-(line 158,col 90)",
        "(line 159,col 9)-(line 159,col 65)",
        "(line 160,col 9)-(line 160,col 65)",
        "(line 161,col 9)-(line 161,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testTwoSets()",
      "begin_line": 165,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 175,col 66)",
        "(line 177,col 9)-(line 189,col 18)",
        "(line 191,col 9)-(line 195,col 68)",
        "(line 197,col 9)-(line 198,col 99)",
        "(line 199,col 9)-(line 199,col 66)",
        "(line 200,col 9)-(line 200,col 66)",
        "(line 201,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 202,col 66)",
        "(line 203,col 9)-(line 203,col 76)",
        "(line 204,col 9)-(line 204,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-c93224d5-64e0-4c04-b056-184eff6f0dd3.precondition(double[], double[])",
      "begin_line": 179,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 180,col 25)-(line 180,col 47)",
        "(line 181,col 25)-(line 181,col 38)",
        "(line 182,col 25)-(line 182,col 38)",
        "(line 183,col 25)-(line 183,col 38)",
        "(line 184,col 25)-(line 184,col 38)",
        "(line 185,col 25)-(line 185,col 60)",
        "(line 186,col 25)-(line 186,col 36)",
        "(line 187,col 25)-(line 187,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 208,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 214,col 37)",
        "(line 215,col 9)-(line 217,col 88)",
        "(line 218,col 9)-(line 219,col 94)",
        "(line 220,col 9)-(line 220,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 223,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 230,col 44)",
        "(line 231,col 9)-(line 234,col 83)",
        "(line 235,col 9)-(line 236,col 94)",
        "(line 237,col 9)-(line 237,col 65)",
        "(line 238,col 9)-(line 238,col 65)",
        "(line 239,col 9)-(line 239,col 65)",
        "(line 240,col 9)-(line 240,col 65)",
        "(line 242,col 9)-(line 247,col 44)",
        "(line 248,col 9)-(line 249,col 94)",
        "(line 250,col 9)-(line 250,col 67)",
        "(line 251,col 9)-(line 251,col 67)",
        "(line 252,col 9)-(line 252,col 67)",
        "(line 253,col 9)-(line 253,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 257,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 263,col 43)",
        "(line 265,col 9)-(line 267,col 88)",
        "(line 268,col 9)-(line 269,col 93)",
        "(line 270,col 9)-(line 270,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 274,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 282,col 55)",
        "(line 283,col 9)-(line 285,col 88)",
        "(line 286,col 9)-(line 287,col 99)",
        "(line 288,col 9)-(line 288,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 291,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 297,col 43)",
        "(line 299,col 9)-(line 301,col 88)",
        "(line 302,col 9)-(line 303,col 87)",
        "(line 304,col 9)-(line 304,col 64)",
        "(line 305,col 9)-(line 305,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 309,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 315,col 43)",
        "(line 317,col 9)-(line 319,col 88)",
        "(line 320,col 9)-(line 321,col 87)",
        "(line 322,col 9)-(line 322,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 326,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 49)",
        "(line 329,col 9)-(line 329,col 38)",
        "(line 330,col 9)-(line 330,col 38)",
        "(line 331,col 9)-(line 331,col 38)",
        "(line 332,col 9)-(line 332,col 38)",
        "(line 333,col 9)-(line 333,col 38)",
        "(line 334,col 9)-(line 337,col 83)",
        "(line 338,col 9)-(line 339,col 96)",
        "(line 340,col 9)-(line 340,col 103)",
        "(line 341,col 9)-(line 341,col 76)",
        "(line 342,col 9)-(line 342,col 60)",
        "(line 343,col 9)-(line 343,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateFunction",
        "java.io.Serializable"
      ],
      "begin_line": 346,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 351,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 56)",
        "(line 353,col 13)-(line 353,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient(double[])",
      "begin_line": 356,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 357,col 13)-(line 357,col 48)",
        "(line 358,col 13)-(line 360,col 13)",
        "(line 361,col 13)-(line 361,col 56)",
        "(line 362,col 13)-(line 364,col 13)",
        "(line 365,col 13)-(line 365,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 368,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 369,col 13)-(line 369,col 52)",
        "(line 370,col 13)-(line 370,col 27)",
        "(line 371,col 13)-(line 374,col 13)",
        "(line 375,col 13)-(line 375,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient()",
      "begin_line": 378,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 379,col 13)-(line 383,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-223eb4e5-da22-4d6a-b490-2d9f7a71866e.value(double[])",
      "begin_line": 380,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 21)-(line 381,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.partialDerivative(int)",
      "begin_line": 386,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 387,col 13)-(line 391,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-85093b14-9b2f-4776-baf4-9966c351855c.value(double[])",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 21)-(line 389,col 46)"
      ]
    }
  ]
}