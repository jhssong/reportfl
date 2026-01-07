{
  "filepath": "/tmp/Math-5b/src/test/java/org/apache/commons/math3/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 101,
      "end_line": 389,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testTrivial()",
      "begin_line": 102,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 76)",
        "(line 106,col 9)-(line 108,col 88)",
        "(line 109,col 9)-(line 110,col 84)",
        "(line 111,col 9)-(line 111,col 65)",
        "(line 112,col 9)-(line 112,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation()",
      "begin_line": 115,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 62)",
        "(line 121,col 9)-(line 123,col 88)",
        "(line 124,col 9)-(line 125,col 87)",
        "(line 126,col 9)-(line 126,col 65)",
        "(line 127,col 9)-(line 127,col 65)",
        "(line 128,col 9)-(line 128,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testNoDependency()",
      "begin_line": 132,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 144,col 88)",
        "(line 145,col 9)-(line 146,col 99)",
        "(line 147,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testOneSet()",
      "begin_line": 152,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 158,col 36)",
        "(line 159,col 9)-(line 161,col 88)",
        "(line 162,col 9)-(line 163,col 90)",
        "(line 164,col 9)-(line 164,col 65)",
        "(line 165,col 9)-(line 165,col 65)",
        "(line 166,col 9)-(line 166,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testTwoSets()",
      "begin_line": 170,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 38)",
        "(line 173,col 9)-(line 180,col 66)",
        "(line 182,col 9)-(line 194,col 18)",
        "(line 196,col 9)-(line 200,col 68)",
        "(line 202,col 9)-(line 203,col 99)",
        "(line 204,col 9)-(line 204,col 66)",
        "(line 205,col 9)-(line 205,col 66)",
        "(line 206,col 9)-(line 206,col 66)",
        "(line 207,col 9)-(line 207,col 66)",
        "(line 208,col 9)-(line 208,col 76)",
        "(line 209,col 9)-(line 209,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-d69959ff-a679-41d3-8e3d-9eb5c5a23a27.precondition(double[], double[])",
      "begin_line": 184,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 185,col 25)-(line 185,col 47)",
        "(line 186,col 25)-(line 186,col 38)",
        "(line 187,col 25)-(line 187,col 38)",
        "(line 188,col 25)-(line 188,col 38)",
        "(line 189,col 25)-(line 189,col 38)",
        "(line 190,col 25)-(line 190,col 60)",
        "(line 191,col 25)-(line 191,col 36)",
        "(line 192,col 25)-(line 192,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 213,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 219,col 37)",
        "(line 220,col 9)-(line 222,col 88)",
        "(line 223,col 9)-(line 224,col 94)",
        "(line 225,col 9)-(line 225,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 228,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 235,col 44)",
        "(line 236,col 9)-(line 239,col 83)",
        "(line 240,col 9)-(line 241,col 94)",
        "(line 242,col 9)-(line 242,col 65)",
        "(line 243,col 9)-(line 243,col 65)",
        "(line 244,col 9)-(line 244,col 65)",
        "(line 245,col 9)-(line 245,col 65)",
        "(line 247,col 9)-(line 252,col 44)",
        "(line 253,col 9)-(line 254,col 94)",
        "(line 255,col 9)-(line 255,col 67)",
        "(line 256,col 9)-(line 256,col 67)",
        "(line 257,col 9)-(line 257,col 67)",
        "(line 258,col 9)-(line 258,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 262,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 268,col 43)",
        "(line 270,col 9)-(line 272,col 88)",
        "(line 273,col 9)-(line 274,col 93)",
        "(line 275,col 9)-(line 275,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 279,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 290,col 88)",
        "(line 291,col 9)-(line 292,col 99)",
        "(line 293,col 9)-(line 293,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 296,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 302,col 43)",
        "(line 304,col 9)-(line 306,col 88)",
        "(line 307,col 9)-(line 308,col 87)",
        "(line 309,col 9)-(line 309,col 64)",
        "(line 310,col 9)-(line 310,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 314,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 320,col 43)",
        "(line 322,col 9)-(line 324,col 88)",
        "(line 325,col 9)-(line 326,col 87)",
        "(line 327,col 9)-(line 327,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 331,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 49)",
        "(line 334,col 9)-(line 334,col 38)",
        "(line 335,col 9)-(line 335,col 38)",
        "(line 336,col 9)-(line 336,col 38)",
        "(line 337,col 9)-(line 337,col 38)",
        "(line 338,col 9)-(line 338,col 38)",
        "(line 339,col 9)-(line 342,col 83)",
        "(line 343,col 9)-(line 344,col 96)",
        "(line 345,col 9)-(line 345,col 91)",
        "(line 346,col 9)-(line 346,col 76)",
        "(line 347,col 9)-(line 347,col 65)",
        "(line 348,col 9)-(line 348,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction",
        "java.io.Serializable"
      ],
      "begin_line": 351,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 356,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 357,col 13)-(line 357,col 56)",
        "(line 358,col 13)-(line 358,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 361,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 52)",
        "(line 363,col 13)-(line 363,col 27)",
        "(line 364,col 13)-(line 367,col 13)",
        "(line 368,col 13)-(line 368,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 371,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 89)",
        "(line 373,col 13)-(line 378,col 13)",
        "(line 380,col 13)-(line 380,col 72)",
        "(line 381,col 13)-(line 384,col 13)",
        "(line 385,col 13)-(line 385,col 23)"
      ]
    }
  ]
}