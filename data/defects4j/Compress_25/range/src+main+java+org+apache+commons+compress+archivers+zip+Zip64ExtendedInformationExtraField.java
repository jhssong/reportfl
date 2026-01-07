{
  "filepath": "/tmp/Compress-25b/src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Zip64ExtendedInformationExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 43,
      "end_line": 317,
      "comment": "\n * Holds size and other extended information for entries that use Zip64\n * features.\n *\n * \u003cp\u003eCurrently Commons Compress doesn\u0027t support encrypting the\n * central directory so the note in APPNOTE.TXT about masking doesn\u0027t\n * apply.\u003c/p\u003e\n *\n * \u003cp\u003eThe implementation relies on data being read from the local file\n * header and assumes that both size values are always present.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003ePKWARE\u0027s\n * APPNOTE.TXT, section 4.5.3\u003c/a\u003e\n *\n * @since 1.2\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_MUST_HAVE_BOTH_SIZES_MSG"
      ],
      "begin_line": 47,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size",
        "compressedSize",
        "relativeHeaderOffset"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "diskStart"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawCentralDirectoryData"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Stored in {@link #parseFromCentralDirectoryData\n     * parseFromCentralDirectoryData} so it can be reused when ZipFile\n     * calls {@link #reparseCentralDirectoryData\n     * reparseCentralDirectoryData}.\n     *\n     * \u003cp\u003eNot used for anything else\u003c/p\u003e\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * This constructor should only be used by the code that reads\n     * archives inside of Commons Compress.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Creates an extra field based on the original and compressed size.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 94,
      "end_line": 102,
      "comment": "\n     * Creates an extra field based on all four possible values.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 25)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 101,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getHeaderId()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataLength()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryLength()",
      "begin_line": 112,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 116,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData()",
      "begin_line": 119,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData()",
      "begin_line": 131,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 71)",
        "(line 133,col 9)-(line 133,col 33)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 145,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 24)",
        "(line 159,col 9)-(line 159,col 65)",
        "(line 160,col 9)-(line 160,col 24)",
        "(line 161,col 9)-(line 161,col 43)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 174,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 51)",
        "(line 179,col 9)-(line 179,col 77)",
        "(line 187,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.reparseCentralDirectoryData(boolean, boolean, boolean, boolean)",
      "begin_line": 209,
      "end_line": 247,
      "comment": "\n     * Parses the raw bytes read from the central directory extra\n     * field with knowledge which fields are expected to be there.\n     *\n     * \u003cp\u003eAll four fields inside the zip64 extended information extra\n     * field are optional and must only be present if their corresponding\n     * entry inside the central directory contains the correct magic\n     * value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getSize()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCompressedSize()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * The compressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setCompressedSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getRelativeHeaderOffset()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setRelativeHeaderOffset(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getDiskStartNumber()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setDiskStartNumber(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(byte[])",
      "begin_line": 305,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 20)",
        "(line 307,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 19)"
      ]
    }
  ]
}