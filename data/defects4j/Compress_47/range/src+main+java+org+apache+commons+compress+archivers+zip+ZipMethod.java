{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/ZipMethod.java",
  "nodes": [
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_CODE"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeToEnum"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipMethod.ZipMethod()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipMethod.ZipMethod(int)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * private constructor for enum style class.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipMethod.getCode()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * the code of the compression method.\n     *\n     * @see ZipArchiveEntry#getMethod()\n     *\n     * @return an integer code for the method\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(int)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * returns the {@link ZipMethod} for the given code or null if the\n     * method is not known.\n     * @param code the code\n     * @return the {@link ZipMethod} for the given code or null if the\n     * method is not known.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 36)"
      ]
    }
  ]
}