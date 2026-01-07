{
  "filepath": "/tmp/Math-46b/src/test/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 97,
      "end_line": 395,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTrivial()",
      "begin_line": 98,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 76)",
        "(line 102,col 9)-(line 104,col 94)",
        "(line 105,col 9)-(line 106,col 84)",
        "(line 107,col 9)-(line 107,col 65)",
        "(line 108,col 9)-(line 108,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation()",
      "begin_line": 111,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 62)",
        "(line 117,col 9)-(line 119,col 94)",
        "(line 120,col 9)-(line 121,col 87)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 123,col 65)",
        "(line 124,col 9)-(line 124,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNoDependency()",
      "begin_line": 128,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 140,col 94)",
        "(line 141,col 9)-(line 142,col 99)",
        "(line 143,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testOneSet()",
      "begin_line": 148,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 154,col 36)",
        "(line 155,col 9)-(line 157,col 94)",
        "(line 158,col 9)-(line 159,col 90)",
        "(line 160,col 9)-(line 160,col 65)",
        "(line 161,col 9)-(line 161,col 65)",
        "(line 162,col 9)-(line 162,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTwoSets()",
      "begin_line": 166,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 38)",
        "(line 169,col 9)-(line 176,col 66)",
        "(line 178,col 9)-(line 190,col 18)",
        "(line 192,col 9)-(line 196,col 68)",
        "(line 198,col 9)-(line 199,col 99)",
        "(line 200,col 9)-(line 200,col 66)",
        "(line 201,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 202,col 66)",
        "(line 203,col 9)-(line 203,col 66)",
        "(line 204,col 9)-(line 204,col 76)",
        "(line 205,col 9)-(line 205,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-e85766b9-8002-4393-925c-e3e5a16fda6e.precondition(double[], double[])",
      "begin_line": 180,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 181,col 25)-(line 181,col 47)",
        "(line 182,col 25)-(line 182,col 38)",
        "(line 183,col 25)-(line 183,col 38)",
        "(line 184,col 25)-(line 184,col 38)",
        "(line 185,col 25)-(line 185,col 38)",
        "(line 186,col 25)-(line 186,col 60)",
        "(line 187,col 25)-(line 187,col 36)",
        "(line 188,col 25)-(line 188,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 209,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 218,col 94)",
        "(line 219,col 9)-(line 220,col 94)",
        "(line 221,col 9)-(line 221,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 224,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 231,col 44)",
        "(line 232,col 9)-(line 235,col 83)",
        "(line 236,col 9)-(line 237,col 94)",
        "(line 238,col 9)-(line 238,col 65)",
        "(line 239,col 9)-(line 239,col 65)",
        "(line 240,col 9)-(line 240,col 65)",
        "(line 241,col 9)-(line 241,col 65)",
        "(line 243,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 250,col 94)",
        "(line 251,col 9)-(line 251,col 67)",
        "(line 252,col 9)-(line 252,col 67)",
        "(line 253,col 9)-(line 253,col 67)",
        "(line 254,col 9)-(line 254,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 258,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 264,col 43)",
        "(line 266,col 9)-(line 268,col 94)",
        "(line 269,col 9)-(line 270,col 93)",
        "(line 271,col 9)-(line 271,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 275,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 286,col 94)",
        "(line 287,col 9)-(line 288,col 99)",
        "(line 289,col 9)-(line 289,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 292,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 298,col 43)",
        "(line 300,col 9)-(line 302,col 94)",
        "(line 303,col 9)-(line 304,col 87)",
        "(line 305,col 9)-(line 305,col 64)",
        "(line 306,col 9)-(line 306,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 310,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 316,col 43)",
        "(line 318,col 9)-(line 320,col 94)",
        "(line 321,col 9)-(line 322,col 87)",
        "(line 323,col 9)-(line 323,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 327,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 49)",
        "(line 330,col 9)-(line 330,col 38)",
        "(line 331,col 9)-(line 331,col 38)",
        "(line 332,col 9)-(line 332,col 38)",
        "(line 333,col 9)-(line 333,col 38)",
        "(line 334,col 9)-(line 334,col 38)",
        "(line 335,col 9)-(line 338,col 83)",
        "(line 339,col 9)-(line 340,col 96)",
        "(line 341,col 9)-(line 341,col 103)",
        "(line 342,col 9)-(line 342,col 76)",
        "(line 343,col 9)-(line 343,col 60)",
        "(line 344,col 9)-(line 344,col 60)"
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
      "begin_line": 347,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 352,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 353,col 13)-(line 353,col 56)",
        "(line 354,col 13)-(line 354,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient(double[])",
      "begin_line": 357,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 48)",
        "(line 359,col 13)-(line 361,col 13)",
        "(line 362,col 13)-(line 362,col 56)",
        "(line 363,col 13)-(line 365,col 13)",
        "(line 366,col 13)-(line 366,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 369,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 52)",
        "(line 371,col 13)-(line 371,col 27)",
        "(line 372,col 13)-(line 375,col 13)",
        "(line 376,col 13)-(line 376,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient()",
      "begin_line": 379,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 380,col 13)-(line 384,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-55faf834-f96e-4741-a9a2-920fada0a36c.value(double[])",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 21)-(line 382,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.partialDerivative(int)",
      "begin_line": 387,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 388,col 13)-(line 392,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-dc0fa4c8-0d98-40a3-9bdb-f72d63168534.value(double[])",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 21)-(line 390,col 46)"
      ]
    }
  ]
}