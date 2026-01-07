{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/sevenz/Folder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Folder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 72,
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
      "begin_line": 27,
      "end_line": 27,
      "comment": "/ Total number of input streams across all coders."
    },
    {
      "type": "field",
      "varNames": [
        "totalOutputStreams"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": "/ Total number of output streams across all coders."
    },
    {
      "type": "field",
      "varNames": [
        "bindPairs"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": "/ Mapping between input and output streams."
    },
    {
      "type": "field",
      "varNames": [
        "packedStreams"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "/ Indeces of input streams, one per input stream not listed in bindPairs."
    },
    {
      "type": "field",
      "varNames": [
        "unpackSizes"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "/ Unpack sizes, per each output stream."
    },
    {
      "type": "field",
      "varNames": [
        "hasCrc"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "/ Whether the folder has a CRC."
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "/ The CRC, if present."
    },
    {
      "type": "field",
      "varNames": [
        "numUnpackSubStreams"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "/ The number of unpack substreams, one per non-empty file in this folder."
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForInStream(int)",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForOutStream(int)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.getUnpackSize()",
      "begin_line": 61,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 17)"
      ]
    }
  ]
}