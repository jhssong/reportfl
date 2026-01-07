{
  "filepath": "/tmp/Math-20b/src/test/java/org/apache/commons/math3/optimization/MultivariateDifferentiableVectorMultiStartOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateDifferentiableVectorMultiStartOptimizerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 240,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.testTrivial()",
      "begin_line": 98,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 76)",
        "(line 105,col 9)-(line 130,col 10)",
        "(line 131,col 9)-(line 131,col 56)",
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 134,col 85)",
        "(line 135,col 9)-(line 137,col 86)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 147,col 101)",
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 65)",
        "(line 150,col 9)-(line 150,col 62)",
        "(line 151,col 9)-(line 151,col 47)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 59)",
        "(line 157,col 9)-(line 157,col 59)",
        "(line 158,col 9)-(line 158,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "gn"
      ],
      "begin_line": 107,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-7ab2bd8b-b308-45be-91b2-2761d98408d5.optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, double[], double[], double[])",
      "begin_line": 111,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 17)-(line 116,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-a1ef2d39-8e85-4c7e-8a51-325dbfcafa01.getMaxEvaluations()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 17)-(line 120,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-04fcc846-5b6e-46ef-9fe2-f2f7b0ec93bb.getEvaluations()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 17)-(line 124,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-97aa1789-8f3a-4092-b143-301c0c046163.getConvergenceChecker()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 17)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.testNoOptimum()",
      "begin_line": 161,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 192,col 10)",
        "(line 193,col 9)-(line 193,col 56)",
        "(line 194,col 9)-(line 194,col 32)",
        "(line 195,col 9)-(line 196,col 85)",
        "(line 197,col 9)-(line 199,col 86)",
        "(line 200,col 9)-(line 207,col 75)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "gn"
      ],
      "begin_line": 169,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-25b95722-60aa-42b4-99ae-284173b5bfc9.optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, double[], double[], double[])",
      "begin_line": 173,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 17)-(line 178,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-4dbe8f69-deec-4fd6-bd16-7e2f275c47be.getMaxEvaluations()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 17)-(line 182,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-fe654980-f8ca-4ed1-bf85-bd279dc3d51a.getEvaluations()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 17)-(line 186,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-7e181c69-8de2-4e32-9fe4-05745c784351.getConvergenceChecker()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 17)-(line 190,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-7ca437fc-47cf-49aa-9710-93e3c67e6035.value(double[])",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 17)-(line 202,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.Anonymous-9079fbcb-54ce-4eed-8825-c3c2bca7bdc4.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 17)-(line 205,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 210,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction"
      ],
      "begin_line": 214,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 56)",
        "(line 220,col 13)-(line 220,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest.LinearProblem.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 227,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 89)",
        "(line 229,col 13)-(line 234,col 13)",
        "(line 235,col 13)-(line 235,col 21)"
      ]
    }
  ]
}