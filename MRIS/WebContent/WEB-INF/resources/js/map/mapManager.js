/**
 * 地图管理
 */
var map;
var basinlyr, veclyr, veclyra, terlyr, terlyra, imglyr, imglyra;
var MapManager = {
	init : function() {
		dojo.require("esri.map");
		dojo.require("esri.geometry.Point");
		function init() {
			map = new esri.Map("arcgisDiv", {
				logo : false,
				slider : false,
				wrapAround180 : true
			});
			esri.config.defaults.io.proxyUrl = "proxy.jsp";
			basinlyr = new esri.layers.ArcGISDynamicMapServiceLayer("http://localhost:6080/arcgis/rest/services/world_only/MapServer");
			veclyr = new esrichina.TianDiTuLayer(
					esrichina.TianDiTuLayer.VEC_BASE_GCS);
			veclyra = new esrichina.TianDiTuLayer(
					esrichina.TianDiTuLayer.VEC_ANNO_GCS);
			terlyr = new esrichina.TianDiTuLayer(
					esrichina.TianDiTuLayer.TER_BASE_GCS);
			terlyra = new esrichina.TianDiTuLayer(
					esrichina.TianDiTuLayer.TER_ANNO_GCS);
			imglyr = new esrichina.TianDiTuLayer(
					esrichina.TianDiTuLayer.IMG_BASE_GCS);
			imglyra = new esrichina.TianDiTuLayer(
					esrichina.TianDiTuLayer.IMG_ANNO_GCS);
			//map.addLayer(basinlyr);
			map.addLayers([terlyr,terlyra]);
			var pt = new esri.geometry.Point(116, 40);
			map.centerAndZoom(pt, 3);
		}
		dojo.addOnLoad(init);
	},
	switchMap:function(idx) {
		if(idx==0)
		{
			map.removeAllLayers();
			map.addLayers([ basinlyr]);
		}
		if (idx == 1) {
			map.removeAllLayers();
			map.addLayers([ terlyr, terlyra ]);
		} else if (idx == 2) {
			map.removeAllLayers();
			map.addLayers([ veclyr, veclyra ]);
		} else if (idx == 3) {
			map.removeAllLayers();
			map.addLayers([ imglyr, imglyra ]);
			/*map.reorderLayer(imglyr,0);
			map.reorderLayer(imglyra,1);*/
		}
	},
};