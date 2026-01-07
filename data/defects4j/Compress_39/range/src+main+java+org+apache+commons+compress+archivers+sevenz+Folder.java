{
  "filepath": "/tmp/Compress-39b/src/main/java/org/apache/commons/compress/archivers/sevenz/Folder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Folder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 115,
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
      "begin_line": 46,
      "end_line": 46,
      "comment": "/ folder."
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.getOrderedCoders()",
      "begin_line": 54,
      "end_line": 63,
      "comment": "\n     * Sorts Coders using bind pairs.\n     * \u003cp\u003eThe first coder reads from the packed stream (we currently\n     * only support single input stream decoders), the second reads\n     * from the output of the first and so on.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 60)",
        "(line 56,col 9)-(line 56,col 45)",
        "(line 57,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForInStream(int)",
      "begin_line": 65,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.findBindPairForOutStream(int)",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.getUnpackSize()",
      "begin_line": 83,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.getUnpackSizeForCoder(org.apache.commons.compress.archivers.sevenz.Coder)",
      "begin_line": 95,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Folder.toString()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 113,col 64)"
      ]
    }
  ]
}