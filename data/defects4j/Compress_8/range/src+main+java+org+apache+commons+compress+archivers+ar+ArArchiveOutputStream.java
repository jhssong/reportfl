{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 34,
      "end_line": 202,
      "comment": "\n * Implements the \"ar\" archive format as an output stream.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archiveOffset"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevEntry"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.ArArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 74)",
        "(line 51,col 9)-(line 51,col 26)",
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 56,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 71,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 57)",
        "(line 77,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 29)",
        "(line 91,col 9)-(line 91,col 52)",
        "(line 93,col 9)-(line 93,col 24)",
        "(line 94,col 9)-(line 94,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 97,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 47)",
        "(line 100,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 52)",
        "(line 111,col 9)-(line 111,col 21)",
        "(line 112,col 9)-(line 112,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 115,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 24)",
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 27)",
        "(line 125,col 9)-(line 125,col 39)",
        "(line 126,col 9)-(line 126,col 57)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 27)",
        "(line 132,col 9)-(line 132,col 39)",
        "(line 133,col 9)-(line 133,col 49)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 139,col 9)-(line 139,col 39)",
        "(line 140,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 27)",
        "(line 146,col 9)-(line 146,col 39)",
        "(line 147,col 9)-(line 147,col 69)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 28)",
        "(line 153,col 9)-(line 153,col 39)",
        "(line 154,col 9)-(line 154,col 49)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 27)",
        "(line 160,col 9)-(line 160,col 39)",
        "(line 162,col 9)-(line 162,col 48)",
        "(line 164,col 9)-(line 164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 169,col 19)",
        "(line 170,col 9)-(line 170,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 176,
      "end_line": 182,
      "comment": "\n     * Calls finish if necessary, and then closes the OutputStream\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 20)",
        "(line 181,col 9)-(line 181,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 185,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.finish()",
      "begin_line": 194,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 24)"
      ]
    }
  ]
}