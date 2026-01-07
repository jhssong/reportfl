{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PureJavaCrc32C",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.Checksum"
      ],
      "begin_line": 35,
      "end_line": 638,
      "comment": "\n * A pure-java implementation of the CRC32 checksum that uses\n * the CRC32-C polynomial, the same polynomial used by iSCSI\n * and implemented on many Intel chipsets supporting SSE4.2.\n *\n * \u003cp\u003eThis file is a copy of the implementation at the Apache Hadoop project.\u003c/p\u003e\n * @see \"http://svn.apache.org/repos/asf/hadoop/common/trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/PureJavaCrc32C.java\"\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " the current CRC value, bit-flipped "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.PureJavaCrc32C()",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Create a new PureJavaCrc32 object. ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.getValue()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 25)",
        "(line 48,col 5)-(line 48,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.reset()",
      "begin_line": 51,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.update(byte[], int, int)",
      "begin_line": 57,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 23)",
        "(line 61,col 5)-(line 79,col 5)",
        "(line 82,col 5)-(line 92,col 5)",
        "(line 95,col 5)-(line 95,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.PureJavaCrc32C.update(int)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "T8_0_start"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_1_start"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_2_start"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_3_start"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_4_start"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_5_start"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_6_start"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_7_start"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T"
      ],
      "begin_line": 116,
      "end_line": 637,
      "comment": ""
    }
  ]
}