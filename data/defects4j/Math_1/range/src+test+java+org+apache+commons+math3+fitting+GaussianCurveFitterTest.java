{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/fitting/GaussianCurveFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianCurveFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 397,
      "comment": "\n * Tests {@link GaussianCurveFitter}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET1"
      ],
      "begin_line": 31,
      "end_line": 62,
      "comment": " Good data. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET2"
      ],
      "begin_line": 64,
      "end_line": 96,
      "comment": " Poor data: right of peak not symmetric with left of peak. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET3"
      ],
      "begin_line": 98,
      "end_line": 145,
      "comment": " Poor data: long tails. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET4"
      ],
      "begin_line": 147,
      "end_line": 162,
      "comment": " Poor data: right of peak is missing. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET5"
      ],
      "begin_line": 164,
      "end_line": 177,
      "comment": " Good data, but few points. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testFit01()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Basic.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 66)",
        "(line 185,col 9)-(line 185,col 75)",
        "(line 187,col 9)-(line 187,col 69)",
        "(line 188,col 9)-(line 188,col 68)",
        "(line 189,col 9)-(line 189,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testWithMaxIterations1()",
      "begin_line": 192,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 31)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 197,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 201,col 51)",
        "(line 203,col 9)-(line 203,col 69)",
        "(line 204,col 9)-(line 204,col 68)",
        "(line 205,col 9)-(line 205,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testWithMaxIterations2()",
      "begin_line": 208,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 30)",
        "(line 211,col 9)-(line 211,col 50)",
        "(line 213,col 9)-(line 213,col 66)",
        "(line 214,col 9)-(line 217,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testWithStartPoint()",
      "begin_line": 220,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 50)",
        "(line 224,col 9)-(line 224,col 66)",
        "(line 225,col 9)-(line 227,col 51)",
        "(line 229,col 9)-(line 229,col 69)",
        "(line 230,col 9)-(line 230,col 68)",
        "(line 231,col 9)-(line 231,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testFit02()",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Zero points is not enough observed points.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testFit03()",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\n     * Two points is not enough observed points.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 66)",
        "(line 248,col 9)-(line 251,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testFit04()",
      "begin_line": 257,
      "end_line": 265,
      "comment": "\n     * Poor data: right of peak not symmetric with left of peak.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 66)",
        "(line 260,col 9)-(line 260,col 75)",
        "(line 262,col 9)-(line 262,col 68)",
        "(line 263,col 9)-(line 263,col 70)",
        "(line 264,col 9)-(line 264,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testFit05()",
      "begin_line": 270,
      "end_line": 278,
      "comment": "\n     * Poor data: long tails.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 66)",
        "(line 273,col 9)-(line 273,col 75)",
        "(line 275,col 9)-(line 275,col 69)",
        "(line 276,col 9)-(line 276,col 69)",
        "(line 277,col 9)-(line 277,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testFit06()",
      "begin_line": 283,
      "end_line": 291,
      "comment": "\n     * Poor data: right of peak is missing.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 66)",
        "(line 286,col 9)-(line 286,col 75)",
        "(line 288,col 9)-(line 288,col 69)",
        "(line 289,col 9)-(line 289,col 70)",
        "(line 290,col 9)-(line 290,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testFit07()",
      "begin_line": 296,
      "end_line": 304,
      "comment": "\n     * Basic with smaller dataset.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 66)",
        "(line 299,col 9)-(line 299,col 75)",
        "(line 301,col 9)-(line 301,col 68)",
        "(line 302,col 9)-(line 302,col 68)",
        "(line 303,col 9)-(line 303,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testMath519()",
      "begin_line": 306,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 339,col 10)",
        "(line 341,col 9)-(line 341,col 72)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 74)",
        "(line 347,col 9)-(line 347,col 52)",
        "(line 348,col 9)-(line 348,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.testMath798()",
      "begin_line": 351,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 72)",
        "(line 360,col 9)-(line 360,col 29)",
        "(line 362,col 9)-(line 362,col 29)",
        "(line 364,col 9)-(line 364,col 29)",
        "(line 366,col 9)-(line 366,col 28)",
        "(line 368,col 9)-(line 368,col 28)",
        "(line 370,col 9)-(line 370,col 27)",
        "(line 372,col 9)-(line 372,col 74)",
        "(line 375,col 9)-(line 375,col 60)",
        "(line 376,col 9)-(line 376,col 60)",
        "(line 377,col 9)-(line 377,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitterTest.createDataset(double[][])",
      "begin_line": 390,
      "end_line": 396,
      "comment": "\n     * Adds the specified points to specified \u003ccode\u003eGaussianCurveFitter\u003c/code\u003e\n     * instance.\n     *\n     * @param points Data points where first dimension is a point index and\n     *        second dimension is an array of length two representing the point\n     *        with the first value corresponding to X and the second value\n     *        corresponding to Y.\n     * @return the collection of observed points.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 72)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 19)"
      ]
    }
  ]
}