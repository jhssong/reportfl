{
  "filepath": "/tmp/Codec-2b/src/test/org/apache/commons/codec/binary/Base64TestData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 159,
      "comment": "\r\n * This random data was encoded by OpenSSL.  Java had nothing to do with it.\r\n * This data helps us test interop between Commons-Codec and OpenSSL.  Notice\r\n * that OpenSSL creates 64 character lines instead of the 76 of Commons-Codec.\r\n *\r\n * @author Apache Software Foundation\r\n * @version $Id $\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED"
      ],
      "begin_line": 35,
      "end_line": 57,
      "comment": " to further parameterize commons-codec to support this pointless variation."
    },
    {
      "type": "field",
      "varNames": [
        "DECODED"
      ],
      "begin_line": 59,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_KEY"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_READ_KEY"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream)",
      "begin_line": 112,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.fill(byte[], int, java.io.InputStream)",
      "begin_line": 137,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 61)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.resizeArray(byte[])",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 56)",
        "(line 155,col 9)-(line 155,col 65)",
        "(line 156,col 9)-(line 156,col 27)"
      ]
    }
  ]
}