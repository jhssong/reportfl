{
  "filepath": "/tmp/Math-55b/src/test/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
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
        "(line 102,col 9)-(line 103,col 92)",
        "(line 104,col 9)-(line 104,col 86)",
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
        "(line 117,col 9)-(line 118,col 92)",
        "(line 119,col 9)-(line 119,col 86)",
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
        "(line 138,col 9)-(line 139,col 92)",
        "(line 140,col 9)-(line 140,col 86)",
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
        "(line 155,col 9)-(line 156,col 92)",
        "(line 157,col 9)-(line 157,col 86)",
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
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 38)",
        "(line 169,col 9)-(line 176,col 66)",
        "(line 178,col 9)-(line 179,col 92)",
        "(line 180,col 9)-(line 191,col 11)",
        "(line 192,col 9)-(line 192,col 88)",
        "(line 194,col 9)-(line 195,col 99)",
        "(line 196,col 9)-(line 196,col 66)",
        "(line 197,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 198,col 66)",
        "(line 199,col 9)-(line 199,col 66)",
        "(line 200,col 9)-(line 200,col 76)",
        "(line 201,col 9)-(line 201,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-65eadc1b-9fec-4168-9443-289c9e725030.precondition(double[], double[])",
      "begin_line": 181,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 182,col 17)-(line 182,col 39)",
        "(line 183,col 17)-(line 183,col 30)",
        "(line 184,col 17)-(line 184,col 30)",
        "(line 185,col 17)-(line 185,col 30)",
        "(line 186,col 17)-(line 186,col 30)",
        "(line 187,col 17)-(line 187,col 52)",
        "(line 188,col 17)-(line 188,col 28)",
        "(line 189,col 17)-(line 189,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 205,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 211,col 37)",
        "(line 212,col 9)-(line 213,col 92)",
        "(line 214,col 9)-(line 214,col 86)",
        "(line 215,col 9)-(line 216,col 94)",
        "(line 217,col 9)-(line 217,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 220,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 227,col 44)",
        "(line 228,col 9)-(line 229,col 92)",
        "(line 230,col 9)-(line 230,col 88)",
        "(line 231,col 9)-(line 231,col 59)",
        "(line 232,col 9)-(line 232,col 46)",
        "(line 233,col 9)-(line 234,col 94)",
        "(line 235,col 9)-(line 235,col 65)",
        "(line 236,col 9)-(line 236,col 65)",
        "(line 237,col 9)-(line 237,col 65)",
        "(line 238,col 9)-(line 238,col 65)",
        "(line 240,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 247,col 94)",
        "(line 248,col 9)-(line 248,col 67)",
        "(line 249,col 9)-(line 249,col 67)",
        "(line 250,col 9)-(line 250,col 67)",
        "(line 251,col 9)-(line 251,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 255,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 261,col 43)",
        "(line 263,col 9)-(line 264,col 92)",
        "(line 265,col 9)-(line 265,col 86)",
        "(line 266,col 9)-(line 267,col 93)",
        "(line 268,col 9)-(line 268,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 272,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 280,col 55)",
        "(line 281,col 9)-(line 282,col 92)",
        "(line 283,col 9)-(line 283,col 86)",
        "(line 284,col 9)-(line 285,col 99)",
        "(line 286,col 9)-(line 286,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 289,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 295,col 43)",
        "(line 297,col 9)-(line 298,col 92)",
        "(line 299,col 9)-(line 299,col 86)",
        "(line 300,col 9)-(line 301,col 87)",
        "(line 302,col 9)-(line 302,col 64)",
        "(line 303,col 9)-(line 303,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 307,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 313,col 43)",
        "(line 315,col 9)-(line 316,col 92)",
        "(line 317,col 9)-(line 317,col 86)",
        "(line 318,col 9)-(line 319,col 87)",
        "(line 320,col 9)-(line 320,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 324,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 49)",
        "(line 327,col 9)-(line 327,col 38)",
        "(line 328,col 9)-(line 328,col 38)",
        "(line 329,col 9)-(line 329,col 38)",
        "(line 330,col 9)-(line 330,col 38)",
        "(line 331,col 9)-(line 331,col 38)",
        "(line 332,col 9)-(line 333,col 92)",
        "(line 334,col 9)-(line 334,col 88)",
        "(line 335,col 9)-(line 335,col 68)",
        "(line 336,col 9)-(line 336,col 46)",
        "(line 337,col 9)-(line 338,col 96)",
        "(line 339,col 9)-(line 339,col 103)",
        "(line 340,col 9)-(line 340,col 76)",
        "(line 341,col 9)-(line 341,col 60)",
        "(line 342,col 9)-(line 342,col 60)"
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
      "begin_line": 345,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 56)",
        "(line 352,col 13)-(line 352,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient(double[])",
      "begin_line": 355,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 48)",
        "(line 357,col 13)-(line 359,col 13)",
        "(line 360,col 13)-(line 360,col 56)",
        "(line 361,col 13)-(line 363,col 13)",
        "(line 364,col 13)-(line 364,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 367,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 52)",
        "(line 369,col 13)-(line 369,col 27)",
        "(line 370,col 13)-(line 373,col 13)",
        "(line 374,col 13)-(line 374,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient()",
      "begin_line": 377,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 383,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-56b1f5e5-7e91-4f44-905f-070486974ae6.value(double[])",
      "begin_line": 380,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 21)-(line 381,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.partialDerivative(int)",
      "begin_line": 386,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 387,col 13)-(line 392,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-d95a0b3c-00d4-4ebf-91f8-fcf022f377d2.value(double[])",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 21)-(line 390,col 46)"
      ]
    }
  ]
}