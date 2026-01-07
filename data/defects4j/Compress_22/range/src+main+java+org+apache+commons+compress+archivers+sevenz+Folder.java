{
  "filepath": "/tmp/Compress-22b/src/main/java/org/apache/commons/compress/archivers/sevenz/Folder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Folder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 73,
      "comment": "\n * The unit of solid compression.\n "
    },
    {
      "type": "field",
      "varNames": [
        "coders"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": "/ List of coders used in this folder, eg. one for compression, one for encryption."
    },
    {
      "type": "field",
      "varNames": [
        "totalInputStreams"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": "/ this field is currently unused but technically part of the 7z API"
    },
    {
      "type": "field",
      "varNames": [
        "totalOutputStreams"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": "/ Total number of output streams across all coders."
    },
    {
      "type": "field",
      "varNames": [
        "bindPairs"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "/ Mapping between input and output streams."
    },
    {
      "type": "field",
      "varNames": [
        "packedStreams"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "/ Indeces of input streams, one per input stream not listed in bindPairs."
    },
    {
      "type": "field",
      "varNames": [
        "unpackSizes"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "/ Unpack sizes, per each output stream."
    },
    {
      "type": "field",
      "varNames": [
        "hasCrc"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "/ Whether the folder has a CRC."
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "/ The CRC, if present."
    },
    {
      "type": "field",
      "varNames": [
        "numUnpackSubStreams"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "/ The number of unpack substreams, one per non-empty file in this folder."
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForInStream(int)",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForOutStream(int)",
      "begin_line": 53,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.getUnpackSize()",
      "begin_line": 62,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 17)"
      ]
    }
  ]
}