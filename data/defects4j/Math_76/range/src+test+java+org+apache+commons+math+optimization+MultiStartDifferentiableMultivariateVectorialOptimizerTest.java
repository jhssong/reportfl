{
  "filepath": "/tmp/Math-76b/src/test/java/org/apache/commons/math/optimization/MultiStartDifferentiableMultivariateVectorialOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartDifferentiableMultivariateVectorialOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 100,
      "end_line": 192,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.testTrivial()",
      "begin_line": 102,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 76)",
        "(line 106,col 9)-(line 107,col 43)",
        "(line 108,col 9)-(line 108,col 56)",
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 111,col 85)",
        "(line 112,col 9)-(line 114,col 86)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 116,col 89)",
        "(line 119,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 126,col 96)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 65)",
        "(line 130,col 9)-(line 130,col 40)",
        "(line 131,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 136,col 52)",
        "(line 137,col 9)-(line 137,col 51)",
        "(line 138,col 9)-(line 138,col 51)",
        "(line 139,col 9)-(line 139,col 60)",
        "(line 140,col 9)-(line 140,col 60)",
        "(line 141,col 9)-(line 141,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.testNoOptimum()",
      "begin_line": 144,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 148,col 56)",
        "(line 149,col 9)-(line 149,col 32)",
        "(line 150,col 9)-(line 151,col 85)",
        "(line 152,col 9)-(line 154,col 86)",
        "(line 155,col 9)-(line 155,col 40)",
        "(line 156,col 9)-(line 156,col 89)",
        "(line 157,col 9)-(line 164,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.Anonymous-4d72a917-e145-4b92-b7e9-597cf74178ed.jacobian()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 21)-(line 159,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.Anonymous-d9950b45-da30-4909-98eb-05838533dabd.value(double[])",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 21)-(line 162,col 68)"
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
      "begin_line": 167,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 13)-(line 173,col 56)",
        "(line 174,col 13)-(line 174,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 181,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 182,col 13)-(line 187,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest.LinearProblem.Anonymous-87d14bc0-bfcc-4d46-8de3-e28b3006f0ab.value(double[])",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 21)-(line 185,col 45)"
      ]
    }
  ]
}