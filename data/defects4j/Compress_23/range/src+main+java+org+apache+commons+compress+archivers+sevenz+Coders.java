{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 44,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 52,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, byte[])",
      "begin_line": 55,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 74)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "coderTable"
      ],
      "begin_line": 65,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CoderId",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderId.CoderId(org.apache.commons.compress.archivers.sevenz.SevenZMethod, org.apache.commons.compress.archivers.sevenz.Coders.CoderBase)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 33)",
        "(line 77,col 13)-(line 77,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coder"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CoderBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 85,
      "end_line": 86,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase.encode(java.io.OutputStream, byte[])",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 86)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 93,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.encode(java.io.OutputStream, byte[])",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LZMADecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 105,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 106,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 49)",
        "(line 110,col 13)-(line 110,col 48)",
        "(line 111,col 13)-(line 113,col 13)",
        "(line 114,col 13)-(line 116,col 13)",
        "(line 117,col 13)-(line 117,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 121,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 122,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 126,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.encode(java.io.OutputStream, byte[])",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 134,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.encode(java.io.OutputStream, byte[])",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AES256SHA256Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 147,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 148,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 240,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "isInitialized"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cipherInputStream"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-0b3f42d4-f9fd-4a90-acaf-687e08385c9f.init()",
      "begin_line": 155,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 156,col 21)-(line 158,col 21)",
        "(line 159,col 21)-(line 159,col 65)",
        "(line 160,col 21)-(line 160,col 60)",
        "(line 161,col 21)-(line 161,col 65)",
        "(line 162,col 21)-(line 162,col 75)",
        "(line 163,col 21)-(line 163,col 75)",
        "(line 164,col 21)-(line 166,col 21)",
        "(line 167,col 21)-(line 167,col 59)",
        "(line 168,col 21)-(line 168,col 77)",
        "(line 169,col 21)-(line 169,col 51)",
        "(line 170,col 21)-(line 170,col 84)",
        "(line 172,col 21)-(line 174,col 21)",
        "(line 175,col 21)-(line 175,col 45)",
        "(line 176,col 21)-(line 206,col 21)",
        "(line 208,col 21)-(line 208,col 83)",
        "(line 209,col 21)-(line 224,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-1b999f30-e464-42d6-a7af-bd868fd5cb87.read()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 21)-(line 229,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-7f00539a-0b51-4fee-a964-a8ad8144e401.read(byte[], int, int)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 21)-(line 234,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-08b9e66c-875b-4e63-a460-9990965f38c6.close()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DummyByteAddingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 250,
      "end_line": 277,
      "comment": "\n     * ZLIB requires an extra dummy byte.\n     *\n     * @see java.util.zip.Inflater#Inflater(boolean)\n     * @see org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.DummyByteAddingInputStream(java.io.InputStream)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read()",
      "begin_line": 257,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 38)",
        "(line 260,col 13)-(line 263,col 13)",
        "(line 264,col 13)-(line 264,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read(byte[], int, int)",
      "begin_line": 267,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 49)",
        "(line 270,col 13)-(line 274,col 13)",
        "(line 275,col 13)-(line 275,col 26)"
      ]
    }
  ]
}