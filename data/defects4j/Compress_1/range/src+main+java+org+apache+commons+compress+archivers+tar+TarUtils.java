{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 201,
      "comment": " CheckStyle:HideUtilityClassConstructorCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 39,
      "end_line": 66,
      "comment": "\n     * Parse an octal string from a header buffer. This is used for the\n     * file permission mode value.\n     *\n     * @param header The header buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The long value of the octal string.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 27)",
        "(line 41,col 9)-(line 41,col 36)",
        "(line 42,col 9)-(line 42,col 38)",
        "(line 44,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 65,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 76,
      "end_line": 89,
      "comment": "\n     * Parse an entry name from a header buffer.\n     *\n     * @param header The header buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The header\u0027s entry name.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 55)",
        "(line 78,col 9)-(line 78,col 43)",
        "(line 80,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getNameBytes(java.lang.StringBuffer, byte[], int, int)",
      "begin_line": 100,
      "end_line": 112,
      "comment": "\n     * Determine the number of bytes in an entry name.\n     *\n     * @param name The header name from which to parse.\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The number of bytes in a header\u0027s entry name.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 14)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getOctalBytes(long, byte[], int, int)",
      "begin_line": 123,
      "end_line": 148,
      "comment": "\n     * Parse an octal integer from a header buffer.\n     *\n     * @param value The header value\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The integer value of the octal bytes.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 32)",
        "(line 126,col 9)-(line 126,col 30)",
        "(line 127,col 9)-(line 127,col 14)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 129,col 14)",
        "(line 131,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getLongOctalBytes(long, byte[], int, int)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * Parse an octal long integer from a header buffer.\n     *\n     * @param value The header value\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The long value of the octal bytes.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 43)",
        "(line 162,col 9)-(line 162,col 50)",
        "(line 163,col 9)-(line 163,col 55)",
        "(line 165,col 9)-(line 165,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.getCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * Parse the checksum octal integer from a header buffer.\n     *\n     * @param value The header value\n     * @param buf The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The number of header bytes to parse.\n     * @return The integer value of the entry\u0027s checksum.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 50)",
        "(line 180,col 9)-(line 180,col 46)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 183,col 9)-(line 183,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 192,
      "end_line": 200,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 21)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    }
  ]
}