{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/fitting/leastsquares/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractLeastSquaresOptimizerAbstractTest\u003cLevenbergMarquardtOptimizer\u003e"
      ],
      "begin_line": 48,
      "end_line": 403,
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
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testShallowCopy()",
      "begin_line": 60,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 32)",
        "(line 65,col 9)-(line 65,col 38)",
        "(line 66,col 9)-(line 66,col 37)",
        "(line 67,col 9)-(line 67,col 36)",
        "(line 68,col 9)-(line 68,col 38)",
        "(line 69,col 9)-(line 69,col 39)",
        "(line 70,col 9)-(line 75,col 46)",
        "(line 77,col 9)-(line 77,col 72)",
        "(line 80,col 9)-(line 80,col 100)",
        "(line 81,col 9)-(line 81,col 98)",
        "(line 82,col 9)-(line 82,col 108)",
        "(line 83,col 9)-(line 83,col 84)",
        "(line 84,col 9)-(line 84,col 88)",
        "(line 87,col 9)-(line 87,col 38)",
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 89,col 36)",
        "(line 90,col 9)-(line 90,col 38)",
        "(line 91,col 9)-(line 91,col 39)",
        "(line 92,col 9)-(line 97,col 46)",
        "(line 100,col 9)-(line 100,col 101)",
        "(line 101,col 9)-(line 101,col 99)",
        "(line 102,col 9)-(line 102,col 109)",
        "(line 103,col 9)-(line 103,col 85)",
        "(line 104,col 9)-(line 104,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testNonInvertible()",
      "begin_line": 107,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 118,col 37)",
        "(line 120,col 9)-(line 127,col 54)",
        "(line 129,col 9)-(line 129,col 65)",
        "(line 130,col 9)-(line 130,col 109)",
        "(line 132,col 9)-(line 132,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 135,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 55)",
        "(line 138,col 9)-(line 138,col 38)",
        "(line 139,col 9)-(line 139,col 38)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 38)",
        "(line 143,col 9)-(line 145,col 65)",
        "(line 146,col 9)-(line 148,col 64)",
        "(line 149,col 9)-(line 151,col 64)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 155,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math3.analysis.MultivariateVectorFunction, org.apache.commons.math3.analysis.MultivariateMatrixFunction, double, int, double, double, double, boolean)",
      "begin_line": 158,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testBevington()",
      "begin_line": 194,
      "end_line": 264,
      "comment": "\n     * Non-linear test case: fitting of decay curve (from Chapter 8 of\n     * Bevington\u0027s textbook, \"Data reduction and analysis for the physical sciences\").\n     * XXX The expected (\"reference\") values may not be accurate and the tolerance too\n     * relaxed for this test to be currently really useful (the issue is under\n     * investigation).\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 211,col 10)",
        "(line 213,col 9)-(line 213,col 64)",
        "(line 215,col 9)-(line 215,col 45)",
        "(line 216,col 9)-(line 216,col 49)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 231,col 67)",
        "(line 233,col 9)-(line 233,col 66)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 78)",
        "(line 237,col 9)-(line 237,col 85)",
        "(line 238,col 9)-(line 244,col 10)",
        "(line 246,col 9)-(line 246,col 54)",
        "(line 249,col 9)-(line 252,col 9)",
        "(line 256,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.testCircleFitting2()",
      "begin_line": 266,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 39)",
        "(line 269,col 9)-(line 269,col 39)",
        "(line 270,col 9)-(line 270,col 33)",
        "(line 271,col 9)-(line 271,col 33)",
        "(line 272,col 9)-(line 272,col 38)",
        "(line 274,col 9)-(line 274,col 36)",
        "(line 275,col 9)-(line 278,col 51)",
        "(line 279,col 9)-(line 279,col 71)",
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 287,col 9)-(line 287,col 47)",
        "(line 289,col 9)-(line 296,col 34)",
        "(line 298,col 9)-(line 298,col 66)",
        "(line 299,col 9)-(line 299,col 55)",
        "(line 302,col 9)-(line 302,col 96)",
        "(line 305,col 9)-(line 305,col 85)",
        "(line 306,col 9)-(line 306,col 85)",
        "(line 307,col 9)-(line 307,col 84)"
      ]
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 310,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 40)",
        "(line 316,col 13)-(line 316,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 26)",
        "(line 321,col 13)-(line 321,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunction()",
      "begin_line": 324,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 325,col 13)-(line 333,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-90be48cf-acf6-4ecf-a1a1-f90074d3b60d.value(double[])",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 327,col 21)-(line 327,col 59)",
        "(line 328,col 21)-(line 330,col 21)",
        "(line 331,col 21)-(line 331,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.getModelFunctionJacobian()",
      "begin_line": 336,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 337,col 13)-(line 347,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-daa09f63-dc78-471d-a4de-9a63dfb45b6a.value(double[])",
      "begin_line": 338,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 339,col 21)-(line 339,col 66)",
        "(line 340,col 21)-(line 344,col 21)",
        "(line 345,col 21)-(line 345,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BevingtonProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 351,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.BevingtonProblem()",
      "begin_line": 355,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 43)",
        "(line 357,col 13)-(line 357,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.addPoint(double, double)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 24)",
        "(line 362,col 13)-(line 362,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunction()",
      "begin_line": 365,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 366,col 13)-(line 377,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-1c8711ac-dd05-4b61-9930-0eadfcd42ebc.value(double[])",
      "begin_line": 367,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 368,col 21)-(line 368,col 62)",
        "(line 369,col 21)-(line 374,col 21)",
        "(line 375,col 21)-(line 375,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.getModelFunctionJacobian()",
      "begin_line": 380,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 381,col 13)-(line 400,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizerTest.BevingtonProblem.Anonymous-9c60d78b-8a18-42dd-bfae-ba194fe0a025.value(double[])",
      "begin_line": 382,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 383,col 21)-(line 383,col 69)",
        "(line 385,col 21)-(line 397,col 21)",
        "(line 398,col 21)-(line 398,col 36)"
      ]
    }
  ]
}