{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/fitting/GaussianFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 363,
      "comment": "\n * Tests {@link GaussianFitter}.\n *\n * @since 2.2\n * @version $Id: GaussianFitterTest.java 1349707 2012-06-13 09:30:56Z erans $\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET1"
      ],
      "begin_line": 32,
      "end_line": 63,
      "comment": " Good data. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET2"
      ],
      "begin_line": 65,
      "end_line": 97,
      "comment": " Poor data: right of peak not symmetric with left of peak. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET3"
      ],
      "begin_line": 99,
      "end_line": 146,
      "comment": " Poor data: long tails. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET4"
      ],
      "begin_line": 148,
      "end_line": 163,
      "comment": " Poor data: right of peak is missing. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET5"
      ],
      "begin_line": 165,
      "end_line": 178,
      "comment": " Good data, but few points. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testFit01()",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * Basic.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 86)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 43)",
        "(line 189,col 9)-(line 189,col 69)",
        "(line 190,col 9)-(line 190,col 68)",
        "(line 191,col 9)-(line 191,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testFit02()",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\n     * Zero points is not enough observed points.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 86)",
        "(line 200,col 9)-(line 200,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testFit03()",
      "begin_line": 206,
      "end_line": 214,
      "comment": "\n     * Two points is not enough observed points.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 86)",
        "(line 209,col 9)-(line 212,col 20)",
        "(line 213,col 9)-(line 213,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testFit04()",
      "begin_line": 219,
      "end_line": 228,
      "comment": "\n     * Poor data: right of peak not symmetric with left of peak.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 86)",
        "(line 222,col 9)-(line 222,col 53)",
        "(line 223,col 9)-(line 223,col 43)",
        "(line 225,col 9)-(line 225,col 68)",
        "(line 226,col 9)-(line 226,col 70)",
        "(line 227,col 9)-(line 227,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testFit05()",
      "begin_line": 233,
      "end_line": 242,
      "comment": "\n     * Poor data: long tails.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 86)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 237,col 9)-(line 237,col 43)",
        "(line 239,col 9)-(line 239,col 69)",
        "(line 240,col 9)-(line 240,col 69)",
        "(line 241,col 9)-(line 241,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testFit06()",
      "begin_line": 247,
      "end_line": 256,
      "comment": "\n     * Poor data: right of peak is missing.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 86)",
        "(line 250,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 251,col 43)",
        "(line 253,col 9)-(line 253,col 69)",
        "(line 254,col 9)-(line 254,col 70)",
        "(line 255,col 9)-(line 255,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testFit07()",
      "begin_line": 261,
      "end_line": 270,
      "comment": "\n     * Basic with smaller dataset.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 86)",
        "(line 264,col 9)-(line 264,col 53)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 267,col 9)-(line 267,col 68)",
        "(line 268,col 9)-(line 268,col 68)",
        "(line 269,col 9)-(line 269,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testMath519()",
      "begin_line": 272,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 305,col 10)",
        "(line 307,col 9)-(line 307,col 86)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 40)",
        "(line 313,col 9)-(line 313,col 52)",
        "(line 314,col 9)-(line 314,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.testMath798()",
      "begin_line": 317,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 92)",
        "(line 326,col 9)-(line 326,col 45)",
        "(line 328,col 9)-(line 328,col 45)",
        "(line 330,col 9)-(line 330,col 45)",
        "(line 332,col 9)-(line 332,col 44)",
        "(line 334,col 9)-(line 334,col 44)",
        "(line 336,col 9)-(line 336,col 43)",
        "(line 338,col 9)-(line 338,col 40)",
        "(line 341,col 9)-(line 341,col 60)",
        "(line 342,col 9)-(line 342,col 60)",
        "(line 343,col 9)-(line 343,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitterTest.addDatasetToGaussianFitter(double[][], org.apache.commons.math3.fitting.GaussianFitter)",
      "begin_line": 357,
      "end_line": 362,
      "comment": "\n     * Adds the specified points to specified \u003ccode\u003eGaussianFitter\u003c/code\u003e\n     * instance.\n     *\n     * @param points data points where first dimension is a point index and\n     *        second dimension is an array of length two representing the point\n     *        with the first value corresponding to X and the second value\n     *        corresponding to Y\n     * @param fitter fitter to which the points in \u003ccode\u003epoints\u003c/code\u003e should be\n     *        added as observed points\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)"
      ]
    }
  ]
}