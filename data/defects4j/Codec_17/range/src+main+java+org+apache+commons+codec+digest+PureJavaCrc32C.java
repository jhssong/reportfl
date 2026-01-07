{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PureJavaCrc32C",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.Checksum"
      ],
      "begin_line": 38,
      "end_line": 640,
      "comment": "\n * A pure-java implementation of the CRC32 checksum that uses\n * the CRC32-C polynomial, the same polynomial used by iSCSI\n * and implemented on many Intel chipsets supporting SSE4.2.\n *\n * Copied from Hadoop 2.3.6:\n * https://git-wip-us.apache.org/repos/asf?p\u003dhadoop.git;a\u003dblob_plain;\n * f\u003dhadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/PureJavaCrc32C.java;\n * hb\u003d2120de588b92b9f22b1cc4188761d6a8c61aa778\n * \u003cp\u003e\n * This class is Not ThreadSafe\n * @since 1.11\n "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " the current CRC value, bit-flipped "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32C.PureJavaCrc32C()",
      "begin_line": 44,
      "end_line": 46,
      "comment": " Create a new PureJavaCrc32 object. ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32C.getValue()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 19)",
        "(line 51,col 5)-(line 51,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32C.reset()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32C.update(byte[], int, int)",
      "begin_line": 59,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 23)",
        "(line 63,col 5)-(line 81,col 5)",
        "(line 84,col 5)-(line 94,col 5)",
        "(line 97,col 5)-(line 97,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32C.update(int)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "T8_0_start"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_1_start"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_2_start"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_3_start"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_4_start"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_5_start"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_6_start"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T8_7_start"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "T"
      ],
      "begin_line": 118,
      "end_line": 639,
      "comment": ""
    }
  ]
}