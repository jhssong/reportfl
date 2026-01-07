{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 202,
      "comment": " CheckStyle:HideUtilityClassConstructorCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 40,
      "end_line": 67,
      "comment": "\n     * Parse an octal string from a header buffer. This is used for the\n     * file permission mode value.\n     *\n     * @param header The header buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The long value of the octal string.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 27)",
        "(line 42,col 9)-(line 42,col 36)",
        "(line 43,col 9)-(line 43,col 38)",
        "(line 45,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 66,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 77,
      "end_line": 90,
      "comment": "\n     * Parse an entry name from a header buffer.\n     *\n     * @param header The header buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The header\u0027s entry name.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 55)",
        "(line 79,col 9)-(line 79,col 43)",
        "(line 81,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getNameBytes(java.lang.StringBuffer, byte[], int, int)",
      "begin_line": 101,
      "end_line": 113,
      "comment": "\n     * Determine the number of bytes in an entry name.\n     *\n     * @param name The header name from which to parse.\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The number of bytes in a header\u0027s entry name.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 14)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getOctalBytes(long, byte[], int, int)",
      "begin_line": 124,
      "end_line": 149,
      "comment": "\n     * Parse an octal integer from a header buffer.\n     *\n     * @param value The header value\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The integer value of the octal bytes.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)",
        "(line 127,col 9)-(line 127,col 30)",
        "(line 128,col 9)-(line 128,col 14)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 130,col 14)",
        "(line 132,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getLongOctalBytes(long, byte[], int, int)",
      "begin_line": 160,
      "end_line": 167,
      "comment": "\n     * Parse an octal long integer from a header buffer.\n     *\n     * @param value The header value\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The long value of the octal bytes.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 43)",
        "(line 163,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 164,col 55)",
        "(line 166,col 9)-(line 166,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 178,
      "end_line": 185,
      "comment": "\n     * Parse the checksum octal integer from a header buffer.\n     *\n     * @param value The header value\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The integer value of the entry\u0027s checksum.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 50)",
        "(line 181,col 9)-(line 181,col 46)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 184,col 9)-(line 184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 193,
      "end_line": 201,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 21)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)"
      ]
    }
  ]
}