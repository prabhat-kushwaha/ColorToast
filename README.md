# ColorToast
Simple android library that help you to show custom Toast Message


<h2><a id="user-content-screenshots" class="anchor" aria-hidden="true" href="#screenshots"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Prerequisites</h2>
<br>




<h4>Add this to your module's build.gradle file </h4>
<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">dependencies {
	        implementation 'com.github.prabhat-kushwaha:ColorToast:1.0'
	}</pre></div>



<h2><a id="user-content-screenshots" class="anchor" aria-hidden="true" href="#screenshots"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Dependency
</h2>
<br>
<h4>Add this in your root build.gradle file</h4>
<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}</pre></div>




<h2><a id="user-content-screenshots" class="anchor" aria-hidden="true" href="#screenshots"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Screenshots</h2>
<br>
<div align="center">
   <table align="center" border="0">
  <tbody><tr>
    <td>
<a target="_blank" rel="noopener noreferrer"><img width="360" src="https://github.com/prabhat-kushwaha/ColorToast/blob/master/ss/success_toast.png" style="max-width:100%;"></a>
       </td><td><a target="_blank" rel="noopener noreferrer" ><img width="360" src="https://github.com/prabhat-kushwaha/ColorToast/blob/master/ss/done_toast.png" style="max-width:100%;"></a>
    </td>
     <td> <a target="_blank" rel="noopener noreferrer" ><img width="360" src="https://github.com/prabhat-kushwaha/ColorToast/blob/master/ss/error_toast.png" style="max-width:100%;"></a></td>
  </tr></tbody></table>
  </div>
<br>

<div align="center">
   <table align="center" border="0">
  <tbody><tr>
    <td>
<a target="_blank" rel="noopener noreferrer"><img width="360" src="https://github.com/prabhat-kushwaha/ColorToast/blob/master/ss/failure_toast.png" style="max-width:100%;"></a>
       </td><td><a target="_blank" rel="noopener noreferrer" ><img width="360" src="https://github.com/prabhat-kushwaha/ColorToast/blob/master/ss/custom_toast.png" style="max-width:100%;"></a>
    </td>
     <td> <a target="_blank" rel="noopener noreferrer" ><img width="360" src="https://github.com/prabhat-kushwaha/ColorToast/blob/master/ss/warning_toast.png" style="max-width:100%;"></a></td>
  </tr></tbody></table>
  </div>
<br>










<h2><a id="user-content-screenshots" class="anchor" aria-hidden="true" href="#screenshots"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Usage</h2>
<br>

<h3>Success Toast Message</h3>

<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">
ToastMessage.showSuccessMessage(context,message,duration);<br/>
E.g.    
ToastMessage.showSuccessMessage(getApplicationContext(), "login successfully", Toast.LENGTH_LONG);
</pre></div>


<h3>Warning Toast Message</h3>

<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">


ToastMessage.showWarningMessage(context,message,duration);<br/>
E.g.
ToastMessage.showWarningMessage(getApplicationContext(), "no internet connection", Toast.LENGTH_LONG);

</pre></div>


<h3>Error Toast Message</h3>

<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">


ToastMessage.showErrorMessage(context,message,duration);<br/>
E.g.
ToastMessage.showErrorMessage(getApplicationContext(), "please enter valid email", Toast.LENGTH_LONG);

</pre></div>

<h3>Custom Toast Message</h3>

<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">


ToastMessage.showCustomMessage(context,message,duration,color,drawable,drawable alignment);<br/>
E.g.
ToastMessage.showCustomMessage(getApplicationContext(), "your message", Toast.LENGTH_LONG, getColor(R.color.colorPrimaryDark), getResources().getDrawable(R.drawable.ic_done_black_24dp), TOP);


</pre></div>








<h3>Done Toast Message</h3>

<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">


ToastMessage.showCustomMessage(context,message,duration);<br/>
E.g.                
ToastMessage.showDoneMessage(getApplicationContext(), "registration successfully", Toast.LENGTH_LONG);


</pre></div>


<h3>Failure Toast Message</h3>

<div class="highlight highlight-source-groovy-gradle"><pre><span class="pl-en">

ToastMessage.showFailureMessage(context,message,duration);<br/>
E.g.
ToastMessage.showFailureMessage(getApplicationContext(), "some fields are empty", Toast.LENGTH_LONG);
           
</pre></div>









             


         


      
