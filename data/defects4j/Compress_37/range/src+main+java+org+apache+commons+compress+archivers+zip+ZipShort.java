{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/archivers/zip/ZipShort.java",
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
      "end_line": 162,
      "comment": "\n * Utility class that represents a two byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_MASK"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(int)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Create instance from a number.\n     * @param value the int to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[])",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipShort\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.ZipShort(byte[], int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create instance from the two bytes starting at offset.\n     * @param bytes the bytes to store as a ZipShort\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes()",
      "begin_line": 66,
      "end_line": 71,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @return the value as a a two byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 42)",
        "(line 68,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 67)",
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Get value as Java int.\n     * @return value as a Java int\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getBytes(int)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * Get value as two bytes in big endian byte order.\n     * @param value the Java int to convert to bytes\n     * @return the converted int as a byte array in big endian byte order\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 42)",
        "(line 88,col 9)-(line 88,col 35)",
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.putShort(int, byte[], int)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * put the value as two bytes in big endian byte order.\n     * @param value the Java int to convert to bytes\n     * @param buf the output buffer\n     * @param  offset\n     *         The offset within the output buffer of the first byte to be written.\n     *         must be non-negative and no larger than \u003ctt\u003ebuf.length-2\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 49)",
        "(line 102,col 9)-(line 102,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[], int)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Helper method to get the value as a java int from two bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding java int value\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 70)",
        "(line 113,col 9)-(line 113,col 45)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.getValue(byte[])",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Helper method to get the value as a java int from a two-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding java int value\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.equals(java.lang.Object)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.hashCode()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipShort\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.clone()",
      "begin_line": 148,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipShort.toString()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 42)"
      ]
    }
  ]
}