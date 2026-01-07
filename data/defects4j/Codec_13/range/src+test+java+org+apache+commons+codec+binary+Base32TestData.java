{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/binary/Base32TestData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 124,
      "comment": "\n * This random data was encoded by OpenSSL. Java had nothing to do with it. This data helps us test interop between\n * Commons-Codec and OpenSSL. Notice that OpenSSL creates 64 character lines instead of the 76 of Commons-Codec.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BASE32_FIXTURE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_KEY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_READ_KEY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.streamToBytes(java.io.InputStream)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.streamToBytes(java.io.InputStream, byte[])",
      "begin_line": 49,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.fill(byte[], int, java.io.InputStream)",
      "begin_line": 72,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 61)",
        "(line 75,col 9)-(line 75,col 28)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.resizeArray(byte[])",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 62)",
        "(line 90,col 9)-(line 90,col 65)",
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.randomData(org.apache.commons.codec.binary.BaseNCodec, int)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n     * Returns an encoded and decoded copy of the same random data.\n     *\n     * @param codec the codec to use\n     * @param size amount of random data to generate and encode\n     * @return two byte[] arrays:  [0] \u003d decoded, [1] \u003d encoded\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 38)",
        "(line 104,col 9)-(line 104,col 46)",
        "(line 105,col 9)-(line 105,col 29)",
        "(line 106,col 9)-(line 106,col 53)",
        "(line 107,col 9)-(line 107,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.bytesContain(byte[], byte)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\n     * Tests the supplied byte[] array to see if it contains the specified byte c.\n     *\n     * @param bytes byte[] array to test\n     * @param c byte to look for\n     * @return true if bytes contains c, false otherwise\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 21)"
      ]
    }
  ]
}