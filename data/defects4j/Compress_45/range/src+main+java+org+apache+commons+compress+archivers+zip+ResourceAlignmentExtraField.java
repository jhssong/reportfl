{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/archivers/zip/ResourceAlignmentExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ResourceAlignmentExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 38,
      "end_line": 138,
      "comment": "\n * An extra field who\u0027s sole purpose is to align and pad the local file header\n * so that the entry\u0027s data starts at a certain position.\n *\n * \u003cp\u003eThe padding content of the padding is ignored and not retained\n * when reading a padding field.\u003c/p\u003e\n *\n * \u003cp\u003eThis enables Commons Compress to create \"aligned\" archives\n * similar to Android\u0027s zipalign command line tool.\u003c/p\u003e\n *\n * @since 1.14\n * @see \"https://developer.android.com/studio/command-line/zipalign.html\"\n * @see ZipArchiveEntry#setAlignment\n "
    },
    {
      "type": "field",
      "varNames": [
        "ID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Extra field id used for storing alignment and padding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BASE_SIZE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALLOW_METHOD_MESSAGE_CHANGE_FLAG"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alignment"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowMethodChange"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ResourceAlignmentExtraField()",
      "begin_line": 55,
      "end_line": 56,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ResourceAlignmentExtraField(int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ResourceAlignmentExtraField(int, boolean)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ResourceAlignmentExtraField(int, boolean, int)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 43)",
        "(line 71,col 9)-(line 71,col 51)",
        "(line 72,col 9)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.getAlignment()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Gets requested alignment.\n     *\n     * @return\n     *      requested alignment.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.allowMethodChange()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Indicates whether method change is allowed when re-compressing the zip file.\n     *\n     * @return\n     *      true if method change is allowed, false otherwise.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.getHeaderId()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.getLocalFileDataLength()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.getCentralDirectoryLength()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.getLocalFileDataData()",
      "begin_line": 110,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 55)",
        "(line 113,col 9)-(line 114,col 38)",
        "(line 115,col 9)-(line 115,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.getCentralDirectoryData()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 62)",
        "(line 126,col 9)-(line 126,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 129,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 63)",
        "(line 135,col 9)-(line 135,col 91)",
        "(line 136,col 9)-(line 136,col 90)"
      ]
    }
  ]
}