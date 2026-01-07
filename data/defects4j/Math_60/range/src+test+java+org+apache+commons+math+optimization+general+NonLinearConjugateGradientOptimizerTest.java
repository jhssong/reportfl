{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 99,
      "end_line": 409,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTrivial()",
      "begin_line": 100,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 76)",
        "(line 104,col 9)-(line 105,col 92)",
        "(line 106,col 9)-(line 106,col 41)",
        "(line 107,col 9)-(line 107,col 86)",
        "(line 108,col 9)-(line 109,col 79)",
        "(line 110,col 9)-(line 110,col 65)",
        "(line 111,col 9)-(line 111,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testColumnsPermutation()",
      "begin_line": 114,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 62)",
        "(line 120,col 9)-(line 121,col 92)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 86)",
        "(line 124,col 9)-(line 125,col 82)",
        "(line 126,col 9)-(line 126,col 65)",
        "(line 127,col 9)-(line 127,col 65)",
        "(line 128,col 9)-(line 128,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNoDependency()",
      "begin_line": 132,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 143,col 92)",
        "(line 144,col 9)-(line 144,col 41)",
        "(line 145,col 9)-(line 145,col 86)",
        "(line 146,col 9)-(line 147,col 94)",
        "(line 148,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testOneSet()",
      "begin_line": 153,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 159,col 36)",
        "(line 160,col 9)-(line 161,col 92)",
        "(line 162,col 9)-(line 162,col 41)",
        "(line 163,col 9)-(line 163,col 86)",
        "(line 164,col 9)-(line 165,col 85)",
        "(line 166,col 9)-(line 166,col 65)",
        "(line 167,col 9)-(line 167,col 65)",
        "(line 168,col 9)-(line 168,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testTwoSets()",
      "begin_line": 172,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 182,col 66)",
        "(line 184,col 9)-(line 185,col 92)",
        "(line 186,col 9)-(line 186,col 41)",
        "(line 187,col 9)-(line 198,col 11)",
        "(line 199,col 9)-(line 199,col 88)",
        "(line 201,col 9)-(line 202,col 94)",
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
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.Anonymous-982e611a-7969-49d1-9c23-135ff5a2e360.precondition(double[], double[])",
      "begin_line": 188,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 189,col 17)-(line 189,col 39)",
        "(line 190,col 17)-(line 190,col 30)",
        "(line 191,col 17)-(line 191,col 30)",
        "(line 192,col 17)-(line 192,col 30)",
        "(line 193,col 17)-(line 193,col 30)",
        "(line 194,col 17)-(line 194,col 52)",
        "(line 195,col 17)-(line 195,col 28)",
        "(line 196,col 17)-(line 196,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testNonInversible()",
      "begin_line": 212,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 218,col 37)",
        "(line 219,col 9)-(line 220,col 92)",
        "(line 221,col 9)-(line 221,col 41)",
        "(line 222,col 9)-(line 222,col 86)",
        "(line 223,col 9)-(line 224,col 89)",
        "(line 225,col 9)-(line 225,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testIllConditioned()",
      "begin_line": 228,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 235,col 44)",
        "(line 236,col 9)-(line 237,col 92)",
        "(line 238,col 9)-(line 238,col 41)",
        "(line 239,col 9)-(line 239,col 88)",
        "(line 240,col 9)-(line 240,col 59)",
        "(line 241,col 9)-(line 241,col 46)",
        "(line 242,col 9)-(line 243,col 89)",
        "(line 244,col 9)-(line 244,col 65)",
        "(line 245,col 9)-(line 245,col 65)",
        "(line 246,col 9)-(line 246,col 65)",
        "(line 247,col 9)-(line 247,col 65)",
        "(line 249,col 9)-(line 254,col 44)",
        "(line 255,col 9)-(line 256,col 89)",
        "(line 257,col 9)-(line 257,col 67)",
        "(line 258,col 9)-(line 258,col 67)",
        "(line 259,col 9)-(line 259,col 67)",
        "(line 260,col 9)-(line 260,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 264,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 270,col 43)",
        "(line 272,col 9)-(line 273,col 92)",
        "(line 274,col 9)-(line 274,col 41)",
        "(line 275,col 9)-(line 275,col 86)",
        "(line 276,col 9)-(line 277,col 88)",
        "(line 278,col 9)-(line 278,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 282,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 290,col 55)",
        "(line 291,col 9)-(line 292,col 92)",
        "(line 293,col 9)-(line 293,col 41)",
        "(line 294,col 9)-(line 294,col 86)",
        "(line 295,col 9)-(line 296,col 94)",
        "(line 297,col 9)-(line 297,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testRedundantEquations()",
      "begin_line": 300,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 306,col 43)",
        "(line 308,col 9)-(line 309,col 92)",
        "(line 310,col 9)-(line 310,col 41)",
        "(line 311,col 9)-(line 311,col 86)",
        "(line 312,col 9)-(line 313,col 82)",
        "(line 314,col 9)-(line 314,col 64)",
        "(line 315,col 9)-(line 315,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testInconsistentEquations()",
      "begin_line": 319,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 325,col 43)",
        "(line 327,col 9)-(line 328,col 92)",
        "(line 329,col 9)-(line 329,col 41)",
        "(line 330,col 9)-(line 330,col 86)",
        "(line 331,col 9)-(line 332,col 82)",
        "(line 333,col 9)-(line 333,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.testCircleFitting()",
      "begin_line": 337,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 49)",
        "(line 340,col 9)-(line 340,col 38)",
        "(line 341,col 9)-(line 341,col 38)",
        "(line 342,col 9)-(line 342,col 38)",
        "(line 343,col 9)-(line 343,col 38)",
        "(line 344,col 9)-(line 344,col 38)",
        "(line 345,col 9)-(line 346,col 92)",
        "(line 347,col 9)-(line 347,col 41)",
        "(line 348,col 9)-(line 348,col 88)",
        "(line 349,col 9)-(line 349,col 68)",
        "(line 350,col 9)-(line 350,col 46)",
        "(line 351,col 9)-(line 352,col 91)",
        "(line 353,col 9)-(line 353,col 103)",
        "(line 354,col 9)-(line 354,col 76)",
        "(line 355,col 9)-(line 355,col 60)",
        "(line 356,col 9)-(line 356,col 60)"
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
      "begin_line": 359,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 364,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 56)",
        "(line 366,col 13)-(line 366,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient(double[])",
      "begin_line": 369,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 48)",
        "(line 371,col 13)-(line 373,col 13)",
        "(line 374,col 13)-(line 374,col 56)",
        "(line 375,col 13)-(line 377,col 13)",
        "(line 378,col 13)-(line 378,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 381,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 52)",
        "(line 383,col 13)-(line 383,col 27)",
        "(line 384,col 13)-(line 387,col 13)",
        "(line 388,col 13)-(line 388,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.gradient()",
      "begin_line": 391,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 392,col 13)-(line 397,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-bcb9fa93-1f02-4748-9fc8-25cae18914ef.value(double[])",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 21)-(line 395,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.partialDerivative(int)",
      "begin_line": 400,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 401,col 13)-(line 406,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizerTest.LinearProblem.Anonymous-d4468319-5253-4268-8665-0a642834da65.value(double[])",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 21)-(line 404,col 46)"
      ]
    }
  ]
}