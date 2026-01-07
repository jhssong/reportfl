{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/zip/ZipLong.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipLong",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 25,
      "end_line": 163,
      "comment": "\n * Utility class that represents a four byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": "private static final int BYTE_BIT_SIZE \u003d 8;"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1"
      ],
      "begin_line": 31,
      "end_line": 31,
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
        "BYTE_2"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_MASK"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_SHIFT"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_MASK"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_SHIFT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Central File Header Signature "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Local File Header Signature "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Data Descriptor signature\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(long)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Create instance from a number.\n     * @param value the long to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[])",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[], int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Create instance from the four bytes starting at offset.\n     * @param bytes the bytes to store as a ZipLong\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @return value as four bytes in big endian order\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes(long)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as four bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 49)",
        "(line 106,col 9)-(line 106,col 72)",
        "(line 107,col 9)-(line 107,col 72)",
        "(line 108,col 9)-(line 108,col 72)",
        "(line 109,col 9)-(line 109,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[], int)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\n     * Helper method to get the value as a Java long from four bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the correspondanding Java long value\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 76)",
        "(line 120,col 9)-(line 120,col 72)",
        "(line 121,col 9)-(line 121,col 72)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Helper method to get the value as a Java long from a four-byte array\n     * @param bytes the array of bytes\n     * @return the correspondanding Java long value\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.equals(java.lang.Object)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.hashCode()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipLong\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.clone()",
      "begin_line": 155,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 161,col 9)"
      ]
    }
  ]
}