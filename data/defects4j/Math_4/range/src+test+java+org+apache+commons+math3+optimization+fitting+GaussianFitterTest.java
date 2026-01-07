{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optimization/fitting/GaussianFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 365,
      "comment": "\n * Tests {@link GaussianFitter}.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET1"
      ],
      "begin_line": 34,
      "end_line": 65,
      "comment": " Good data. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET2"
      ],
      "begin_line": 67,
      "end_line": 99,
      "comment": " Poor data: right of peak not symmetric with left of peak. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET3"
      ],
      "begin_line": 101,
      "end_line": 148,
      "comment": " Poor data: long tails. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET4"
      ],
      "begin_line": 150,
      "end_line": 165,
      "comment": " Poor data: right of peak is missing. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET5"
      ],
      "begin_line": 167,
      "end_line": 180,
      "comment": " Good data, but few points. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testFit01()",
      "begin_line": 185,
      "end_line": 194,
      "comment": "\n     * Basic.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 86)",
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 189,col 43)",
        "(line 191,col 9)-(line 191,col 69)",
        "(line 192,col 9)-(line 192,col 68)",
        "(line 193,col 9)-(line 193,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testFit02()",
      "begin_line": 199,
      "end_line": 203,
      "comment": "\n     * Zero points is not enough observed points.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 86)",
        "(line 202,col 9)-(line 202,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testFit03()",
      "begin_line": 208,
      "end_line": 216,
      "comment": "\n     * Two points is not enough observed points.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 86)",
        "(line 211,col 9)-(line 214,col 20)",
        "(line 215,col 9)-(line 215,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testFit04()",
      "begin_line": 221,
      "end_line": 230,
      "comment": "\n     * Poor data: right of peak not symmetric with left of peak.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 86)",
        "(line 224,col 9)-(line 224,col 53)",
        "(line 225,col 9)-(line 225,col 43)",
        "(line 227,col 9)-(line 227,col 68)",
        "(line 228,col 9)-(line 228,col 70)",
        "(line 229,col 9)-(line 229,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testFit05()",
      "begin_line": 235,
      "end_line": 244,
      "comment": "\n     * Poor data: long tails.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 86)",
        "(line 238,col 9)-(line 238,col 53)",
        "(line 239,col 9)-(line 239,col 43)",
        "(line 241,col 9)-(line 241,col 69)",
        "(line 242,col 9)-(line 242,col 69)",
        "(line 243,col 9)-(line 243,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testFit06()",
      "begin_line": 249,
      "end_line": 258,
      "comment": "\n     * Poor data: right of peak is missing.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 86)",
        "(line 252,col 9)-(line 252,col 53)",
        "(line 253,col 9)-(line 253,col 43)",
        "(line 255,col 9)-(line 255,col 69)",
        "(line 256,col 9)-(line 256,col 70)",
        "(line 257,col 9)-(line 257,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testFit07()",
      "begin_line": 263,
      "end_line": 272,
      "comment": "\n     * Basic with smaller dataset.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 86)",
        "(line 266,col 9)-(line 266,col 53)",
        "(line 267,col 9)-(line 267,col 43)",
        "(line 269,col 9)-(line 269,col 68)",
        "(line 270,col 9)-(line 270,col 68)",
        "(line 271,col 9)-(line 271,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testMath519()",
      "begin_line": 274,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 307,col 10)",
        "(line 309,col 9)-(line 309,col 86)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 40)",
        "(line 315,col 9)-(line 315,col 52)",
        "(line 316,col 9)-(line 316,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.testMath798()",
      "begin_line": 319,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 92)",
        "(line 328,col 9)-(line 328,col 45)",
        "(line 330,col 9)-(line 330,col 45)",
        "(line 332,col 9)-(line 332,col 45)",
        "(line 334,col 9)-(line 334,col 44)",
        "(line 336,col 9)-(line 336,col 44)",
        "(line 338,col 9)-(line 338,col 43)",
        "(line 340,col 9)-(line 340,col 40)",
        "(line 343,col 9)-(line 343,col 60)",
        "(line 344,col 9)-(line 344,col 60)",
        "(line 345,col 9)-(line 345,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitterTest.addDatasetToGaussianFitter(double[][], org.apache.commons.math3.optimization.fitting.GaussianFitter)",
      "begin_line": 359,
      "end_line": 364,
      "comment": "\n     * Adds the specified points to specified \u003ccode\u003eGaussianFitter\u003c/code\u003e\n     * instance.\n     *\n     * @param points data points where first dimension is a point index and\n     *        second dimension is an array of length two representing the point\n     *        with the first value corresponding to X and the second value\n     *        corresponding to Y\n     * @param fitter fitter to which the points in \u003ccode\u003epoints\u003c/code\u003e should be\n     *        added as observed points\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)"
      ]
    }
  ]
}