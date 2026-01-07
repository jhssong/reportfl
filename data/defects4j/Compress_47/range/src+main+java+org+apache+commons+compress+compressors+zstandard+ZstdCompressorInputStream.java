{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/zstandard/ZstdCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZstdCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 33,
      "end_line": 95,
      "comment": "\n * {@link CompressorInputStream} implementation to decode Zstandard encoded stream.\n * Library relies on \u003ca href\u003d\"https://github.com/luben/zstd-jni/\"\u003eZstandard JNI\u003c/a\u003e\n *\n * @since 1.16\n "
    },
    {
      "type": "field",
      "varNames": [
        "decIS"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.ZstdCompressorInputStream(java.io.InputStream)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.available()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.close()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.read(byte[])",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.skip(long)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.mark(int)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.markSupported()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.read()",
      "begin_line": 71,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 37)",
        "(line 74,col 9)-(line 74,col 33)",
        "(line 75,col 9)-(line 75,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.read(byte[], int, int)",
      "begin_line": 78,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 50)",
        "(line 81,col 9)-(line 81,col 19)",
        "(line 82,col 9)-(line 82,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.toString()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream.reset()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 22)"
      ]
    }
  ]
}