{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/util/FastMathResources.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathResources",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 298,
      "comment": "\n * Utility class for saving and loading tabulated data used by\n * {@link FastMath}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RES_DIR"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n     * Resource directory. Assuming that this class and the resource files\n     * are located in the same package as \"FastMath\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RES_PREFIX"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " File resource prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Resource basename for \"EXP_INT_TABLE_A\" and \"EXP_INT_TABLE_B\". "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Resource basename for \"EXP_FRAC_TABLE_A\" and \"EXP_FRAC_TABLE_B\". "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Resource basename for \"LN_MANT\". "
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_IN_DOUBLE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Number of bytes in a \"double\". "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.FastMathResources.FastMathResources()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.createAll()",
      "begin_line": 65,
      "end_line": 124,
      "comment": "\n     * Compute and save all the resources.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 46)",
        "(line 68,col 9)-(line 78,col 9)",
        "(line 81,col 9)-(line 81,col 72)",
        "(line 82,col 9)-(line 82,col 72)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 85,col 9)-(line 85,col 45)",
        "(line 87,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 66)",
        "(line 103,col 9)-(line 103,col 74)",
        "(line 104,col 9)-(line 104,col 74)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 69)",
        "(line 115,col 9)-(line 115,col 69)",
        "(line 117,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.loadExpInt()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Load \"EXP_INT\" tables.\n     * \"EXP_INT_TABLE_A\" is at index 0.\n     * \"EXP_INT_TABLE_B\" is at index 1.\n     *\n     * @return the retrieved data.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.loadExpFrac()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Load \"EXP_FRAC\" tables.\n     * \"EXP_FRAC_TABLE_A\" is at index 0.\n     * \"EXP_FRAC_TABLE_B\" is at index 1.\n     *\n     * @return the retrieved data.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.loadLnMant()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Load \"LN_MANT\".\n     *\n     * @return the retrieved data.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.out(java.lang.String)",
      "begin_line": 162,
      "end_line": 166,
      "comment": "\n     * @param name Basename of the resource.\n     * @return an output stream.\n     * @throws FileNotFoundException if the file cannot be opened.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.saveTable1d(java.lang.String, double[])",
      "begin_line": 172,
      "end_line": 187,
      "comment": "\n     * @param name Basename of the resource.\n     * @param data Data to be stored.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 36)",
        "(line 176,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.saveTable2d(java.lang.String, double[][])",
      "begin_line": 193,
      "end_line": 211,
      "comment": "\n     * @param name Basename of the resource.\n     * @param data Data to be stored.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 36)",
        "(line 196,col 9)-(line 196,col 42)",
        "(line 198,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.in(java.lang.String)",
      "begin_line": 218,
      "end_line": 223,
      "comment": "\n     * @param name Basename of the resource.\n     * @return an input stream.\n     * @throws FileNotFoundException if the resource cannot be accessed.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 56)",
        "(line 221,col 9)-(line 221,col 85)",
        "(line 222,col 9)-(line 222,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.loadTable1d(java.lang.String, int)",
      "begin_line": 230,
      "end_line": 245,
      "comment": "\n     * @param name Basename of the resource.\n     * @param len Size of the data.\n     * @return the retrieved data.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.loadTable2d(java.lang.String, int, int)",
      "begin_line": 253,
      "end_line": 275,
      "comment": "\n     * @param name Basename of the resource.\n     * @param len Size of the table.\n     * @param rowLen Size of each row of the table.\n     * @return the retrieved data.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathResources.transpose(double[][])",
      "begin_line": 285,
      "end_line": 297,
      "comment": "\n     * Transposes a two-dimensional array: The number of rows becomes the\n     * number of columns and vice-versa.\n     * The array must be rectangular (same number of colums in each row).\n     *\n     * @param data Array to be transposed.\n     * @return the transposed array.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 39)",
        "(line 287,col 9)-(line 287,col 39)",
        "(line 288,col 9)-(line 288,col 57)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    }
  ]
}