{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/zip/ZipLong.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipLong",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 24,
      "end_line": 150,
      "comment": "\n * Utility class that represents a four byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n "
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": "private static final int BYTE_BIT_SIZE \u003d 8;"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1"
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
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_MASK"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_SHIFT"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_MASK"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_SHIFT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(long)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Create instance from a number.\n     * @param value the long to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[])",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[], int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Create instance from the four bytes starting at offset.\n     * @param bytes the bytes to store as a ZipLong\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @return value as four bytes in big endian order\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes(long)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as four bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 39)",
        "(line 92,col 9)-(line 92,col 49)",
        "(line 93,col 9)-(line 93,col 72)",
        "(line 94,col 9)-(line 94,col 72)",
        "(line 95,col 9)-(line 95,col 72)",
        "(line 96,col 9)-(line 96,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[], int)",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * Helper method to get the value as a Java long from four bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the correspondanding Java long value\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 76)",
        "(line 107,col 9)-(line 107,col 72)",
        "(line 108,col 9)-(line 108,col 72)",
        "(line 109,col 9)-(line 109,col 45)",
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[])",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Helper method to get the value as a Java long from a four-byte array\n     * @param bytes the array of bytes\n     * @return the correspondanding Java long value\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.equals(java.lang.Object)",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.hashCode()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipLong\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.clone()",
      "begin_line": 142,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 148,col 9)"
      ]
    }
  ]
}