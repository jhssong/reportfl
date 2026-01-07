{
  "filepath": "/tmp/Codec-10b/src/test/org/apache/commons/codec/binary/Base32TestData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 125,
      "comment": "\n * This random data was encoded by OpenSSL. Java had nothing to do with it. This data helps us test interop between\n * Commons-Codec and OpenSSL. Notice that OpenSSL creates 64 character lines instead of the 76 of Commons-Codec.\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BASE32_FIXTURE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_KEY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_READ_KEY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.streamToBytes(java.io.InputStream)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.streamToBytes(java.io.InputStream, byte[])",
      "begin_line": 50,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.fill(byte[], int, java.io.InputStream)",
      "begin_line": 73,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 61)",
        "(line 76,col 9)-(line 76,col 28)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.resizeArray(byte[])",
      "begin_line": 89,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 56)",
        "(line 91,col 9)-(line 91,col 65)",
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.randomData(org.apache.commons.codec.binary.BaseNCodec, int)",
      "begin_line": 103,
      "end_line": 109,
      "comment": "\n     * Returns an encoded and decoded copy of the same random data.\n     * \n     * @param codec the codec to use\n     * @param size amount of random data to generate and encode\n     * @return two byte[] arrays:  [0] \u003d decoded, [1] \u003d encoded \n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 105,col 40)",
        "(line 106,col 9)-(line 106,col 29)",
        "(line 107,col 9)-(line 107,col 47)",
        "(line 108,col 9)-(line 108,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32TestData.bytesContain(byte[], byte)",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Tests the supplied byte[] array to see if it contains the specified byte c.\n     *\n     * @param bytes byte[] array to test\n     * @param c byte to look for\n     * @return true if bytes contains c, false otherwise\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 21)"
      ]
    }
  ]
}