{
  "filepath": "/tmp/Compress-27b/src/main/java/org/apache/commons/compress/archivers/zip/ZipLong.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipLong",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 203,
      "comment": "\n * Utility class that represents a four byte integer with conversion\n * rules for the big endian byte order of ZIP files.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_MASK"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_1_SHIFT"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_MASK"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_2_SHIFT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_MASK"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_3_SHIFT"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Central File Header Signature "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Local File Header Signature "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Data Descriptor signature.\n     *\n     * \u003cp\u003eActually, PKWARE uses this as marker for split/spanned\n     * archives and other archivers have started to use it as Data\n     * Descriptor signature (as well).\u003c/p\u003e\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_MAGIC"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Value stored in size and similar fields if ZIP64 extensions are\n     * used.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE_SEGMENT_SPLIT_MARKER"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": "\n     * Marks ZIP archives that were supposed to be split or spanned\n     * but only needed a single segment in then end (so are actually\n     * neither split nor spanned).\n     *\n     * \u003cp\u003eThis is the \"PK00\" prefix found in some archives.\u003c/p\u003e\n     * @since 1.5\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AED_SIG"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Archive extra data record signature.\n     * @since 1.5\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(long)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Create instance from a number.\n     * @param value the long to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[])",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Create instance from bytes.\n     * @param bytes the bytes to store as a ZipLong\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.ZipLong(byte[], int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Create instance from the four bytes starting at offset.\n     * @param bytes the bytes to store as a ZipLong\n     * @param offset the offset to start\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @return value as four bytes in big endian order\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Get value as Java long.\n     * @return value as a long\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getBytes(long)",
      "begin_line": 135,
      "end_line": 142,
      "comment": "\n     * Get value as four bytes in big endian byte order.\n     * @param value the value to convert\n     * @return value as four bytes in big endian byte order\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 39)",
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 138,col 72)",
        "(line 139,col 9)-(line 139,col 72)",
        "(line 140,col 9)-(line 140,col 72)",
        "(line 141,col 9)-(line 141,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[], int)",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * Helper method to get the value as a Java long from four bytes starting at given array offset\n     * @param bytes the array of bytes\n     * @param offset the offset to start\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 76)",
        "(line 152,col 9)-(line 152,col 72)",
        "(line 153,col 9)-(line 153,col 72)",
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.getValue(byte[])",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Helper method to get the value as a Java long from a four-byte array\n     * @param bytes the array of bytes\n     * @return the corresponding Java long value\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.equals(java.lang.Object)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @param o an object to compare\n     * @return true if the objects are equal\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.hashCode()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * Override to make two instances with same value equal.\n     * @return the value stored in the ZipLong\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.clone()",
      "begin_line": 189,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipLong.toString()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 41)"
      ]
    }
  ]
}