{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/FastMathLiteralArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathLiteralArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 6176,
      "comment": "\n * Utility class for loading tabulated data used by {@link FastMath}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_A"
      ],
      "begin_line": 29,
      "end_line": 1530,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_B"
      ],
      "begin_line": 1535,
      "end_line": 3036,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_A"
      ],
      "begin_line": 3043,
      "end_line": 4069,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     * 1024 \u003d 2^10\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_B"
      ],
      "begin_line": 4074,
      "end_line": 5100,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 5103,
      "end_line": 6128,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMathLiteralArrays.FastMathLiteralArrays()",
      "begin_line": 6134,
      "end_line": 6134,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathLiteralArrays.loadExpIntA()",
      "begin_line": 6141,
      "end_line": 6143,
      "comment": "\n     * Load \"EXP_INT_A\".\n     *\n     * @return a clone of the data array.\n     ",
      "child_ranges": [
        "(line 6142,col 9)-(line 6142,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathLiteralArrays.loadExpIntB()",
      "begin_line": 6149,
      "end_line": 6151,
      "comment": "\n     * Load \"EXP_INT_B\".\n     *\n     * @return a clone of the data array.\n     ",
      "child_ranges": [
        "(line 6150,col 9)-(line 6150,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathLiteralArrays.loadExpFracA()",
      "begin_line": 6157,
      "end_line": 6159,
      "comment": "\n     * Load \"EXP_FRAC_A\".\n     *\n     * @return a clone of the data array.\n     ",
      "child_ranges": [
        "(line 6158,col 9)-(line 6158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathLiteralArrays.loadExpFracB()",
      "begin_line": 6165,
      "end_line": 6167,
      "comment": "\n     * Load \"EXP_FRAC_B\".\n     *\n     * @return a clone of the data array.\n     ",
      "child_ranges": [
        "(line 6166,col 9)-(line 6166,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathLiteralArrays.loadLnMant()",
      "begin_line": 6173,
      "end_line": 6175,
      "comment": "\n     * Load \"LN_MANT\".\n     *\n     * @return a clone of the data array.\n     ",
      "child_ranges": [
        "(line 6174,col 9)-(line 6174,col 31)"
      ]
    }
  ]
}