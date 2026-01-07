{
  "filepath": "/tmp/Compress-28b/src/main/java/org/apache/commons/compress/archivers/sevenz/Folder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Folder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 92,
      "comment": "\n * The unit of solid compression.\n "
    },
    {
      "type": "field",
      "varNames": [
        "coders"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": "/ List of coders used in this folder, eg. one for compression, one for encryption."
    },
    {
      "type": "field",
      "varNames": [
        "totalInputStreams"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": "/ this field is currently unused but technically part of the 7z API"
    },
    {
      "type": "field",
      "varNames": [
        "totalOutputStreams"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "/ Total number of output streams across all coders."
    },
    {
      "type": "field",
      "varNames": [
        "bindPairs"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "/ Mapping between input and output streams."
    },
    {
      "type": "field",
      "varNames": [
        "packedStreams"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "/ Indeces of input streams, one per input stream not listed in bindPairs."
    },
    {
      "type": "field",
      "varNames": [
        "unpackSizes"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "/ Unpack sizes, per each output stream."
    },
    {
      "type": "field",
      "varNames": [
        "hasCrc"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "/ Whether the folder has a CRC."
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "/ The CRC, if present."
    },
    {
      "type": "field",
      "varNames": [
        "numUnpackSubStreams"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "/ The number of unpack substreams, one per non-empty file in this folder."
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.getOrderedCoders()",
      "begin_line": 52,
      "end_line": 61,
      "comment": "\n     * Sorts Coders using bind pairs.\n     * \u003cp\u003eThe first coder reads from the packed stream (we currently\n     * only support single input stream decoders), the second reads\n     * from the output of the first and so on.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 54)",
        "(line 54,col 9)-(line 54,col 45)",
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForInStream(int)",
      "begin_line": 63,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForOutStream(int)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.getUnpackSize()",
      "begin_line": 81,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 17)"
      ]
    }
  ]
}