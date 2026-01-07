{
  "filepath": "/tmp/Math-2b/src/test/java/org/apache/commons/math3/fitting/leastsquares/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractLeastSquaresOptimizerAbstractTest\u003cLevenbergMarquardtOptimizer\u003e"
      ],
      "begin_line": 48,
      "end_line": 356,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.createOptimizer()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.getMaxIterations()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testNonInvertible()",
      "begin_line": 60,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 37)",
        "(line 73,col 9)-(line 80,col 54)",
        "(line 82,col 9)-(line 82,col 65)",
        "(line 83,col 9)-(line 83,col 109)",
        "(line 85,col 9)-(line 85,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 88,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 91,col 38)",
        "(line 92,col 9)-(line 92,col 38)",
        "(line 93,col 9)-(line 93,col 38)",
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 95,col 38)",
        "(line 96,col 9)-(line 98,col 65)",
        "(line 99,col 9)-(line 101,col 64)",
        "(line 102,col 9)-(line 104,col 64)",
        "(line 105,col 9)-(line 105,col 35)",
        "(line 106,col 9)-(line 108,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math3.analysis.MultivariateVectorFunction, org.apache.commons.math3.analysis.MultivariateMatrixFunction, double, int, double, double, double, boolean)",
      "begin_line": 111,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testBevington()",
      "begin_line": 147,
      "end_line": 217,
      "comment": "\n     * Non-linear test case: fitting of decay curve (from Chapter 8 of\n     * Bevington\u0027s textbook, \"Data reduction and analysis for the physical sciences\").\n     * XXX The expected (\"reference\") values may not be accurate and the tolerance too\n     * relaxed for this test to be currently really useful (the issue is under\n     * investigation).\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 164,col 10)",
        "(line 166,col 9)-(line 166,col 64)",
        "(line 168,col 9)-(line 168,col 45)",
        "(line 169,col 9)-(line 169,col 49)",
        "(line 170,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 184,col 67)",
        "(line 186,col 9)-(line 186,col 66)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 78)",
        "(line 190,col 9)-(line 190,col 85)",
        "(line 191,col 9)-(line 197,col 10)",
        "(line 199,col 9)-(line 199,col 54)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 209,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testCircleFitting2()",
      "begin_line": 219,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 39)",
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 223,col 33)",
        "(line 224,col 9)-(line 224,col 33)",
        "(line 225,col 9)-(line 225,col 38)",
        "(line 227,col 9)-(line 227,col 36)",
        "(line 228,col 9)-(line 231,col 51)",
        "(line 232,col 9)-(line 232,col 71)",
        "(line 234,col 9)-(line 234,col 33)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 240,col 9)-(line 240,col 47)",
        "(line 242,col 9)-(line 249,col 34)",
        "(line 251,col 9)-(line 251,col 66)",
        "(line 252,col 9)-(line 252,col 55)",
        "(line 255,col 9)-(line 255,col 96)",
        "(line 258,col 9)-(line 258,col 85)",
        "(line 259,col 9)-(line 259,col 85)",
        "(line 260,col 9)-(line 260,col 84)"
      ]
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 263,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 40)",
        "(line 269,col 13)-(line 269,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 26)",
        "(line 274,col 13)-(line 274,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunction()",
      "begin_line": 277,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 278,col 13)-(line 286,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-05cc5d75-335c-40cc-afaf-8b23d0c8bec6.value(double[])",
      "begin_line": 279,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 280,col 21)-(line 280,col 59)",
        "(line 281,col 21)-(line 283,col 21)",
        "(line 284,col 21)-(line 284,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunctionJacobian()",
      "begin_line": 289,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 290,col 13)-(line 300,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-969756a5-a887-4b56-a8d8-7585d18e0596.value(double[])",
      "begin_line": 291,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 292,col 21)-(line 292,col 66)",
        "(line 293,col 21)-(line 297,col 21)",
        "(line 298,col 21)-(line 298,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BevingtonProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 304,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.BevingtonProblem()",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 309,col 13)-(line 309,col 43)",
        "(line 310,col 13)-(line 310,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.addPoint(double, double)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 24)",
        "(line 315,col 13)-(line 315,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunction()",
      "begin_line": 318,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 319,col 13)-(line 330,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-0a67f7c6-7b87-4bb1-a53f-d317eda315ff.value(double[])",
      "begin_line": 320,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 321,col 21)-(line 321,col 62)",
        "(line 322,col 21)-(line 327,col 21)",
        "(line 328,col 21)-(line 328,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunctionJacobian()",
      "begin_line": 333,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 334,col 13)-(line 353,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-6bc8ac0a-55e4-4fd7-87ac-028f1aa86b6c.value(double[])",
      "begin_line": 335,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 336,col 21)-(line 336,col 69)",
        "(line 338,col 21)-(line 350,col 21)",
        "(line 351,col 21)-(line 351,col 36)"
      ]
    }
  ]
}