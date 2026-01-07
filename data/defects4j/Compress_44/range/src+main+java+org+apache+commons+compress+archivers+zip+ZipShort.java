{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/zip/ZipShort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipShort",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 161,
      "comment": "\n * Utility class that represents a two byte integer with conversion\n * rules for the little endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * ZipShort with a value of 0.\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(int)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create instance from a number.\n     * @param value the int to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[])",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[], int)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Create instance from the two bytes starting at offset.\n     * @param bytes the bytes to store as a ZipShort\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes()",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @return the value as a a two byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 42)",
        "(line 71,col 9)-(line 71,col 54)",
        "(line 72,col 9)-(line 72,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Get value as Java int.\n     * @return value as a Java int\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes(int)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @param value the Java int to convert to bytes\n     * @return the converted int as a byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 42)",
        "(line 90,col 9)-(line 90,col 35)",
        "(line 91,col 9)-(line 91,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.putShort(int, byte[], int)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * put the value as two bytes in big endian byte order.\n     * @param value the Java int to convert to bytes\n     * @param buf the output buffer\n     * @param  offset\n     *         The offset within the output buffer of the first byte to be written.\n     *         must be non-negative and no larger than \u003ctt\u003ebuf.length-2\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[], int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Helper method to get the value as a java int from two bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding java int value\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[])",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Helper method to get the value as a java int from a two-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding java int value\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.equals(java.lang.Object)",
      "begin_line": 130,
      "end_line": 136,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.hashCode()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipShort\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.clone()",
      "begin_line": 147,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.toString()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 42)"
      ]
    }
  ]
}