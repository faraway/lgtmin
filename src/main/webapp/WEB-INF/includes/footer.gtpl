    </div>
    <script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="/js/jquery.cookie.js"></script>
    <script type="text/javascript" src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
      jQuery(function(){
        var protipCookie = jQuery.cookie('protip1');
        console.log ('Protip Cookie: ' + protipCookie);
        if (!protipCookie) {
          console.log ('Showing...');
          jQuery('#protip1').show();
          console.log ('...done');
        }

        jQuery('#protip1 .close').click(function(){
          jQuery.cookie('protip1', 'true');
        });

      });
    </script>
    <script type="text/javascript">
      var _gaq = _gaq || [];
      _gaq.push(['_setAccount', 'UA-40490747-1']);
      _gaq.push(['_trackPageview']);
      (function() {
				var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
				ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';
				var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
      })();
    </script>
  </body>
</html>